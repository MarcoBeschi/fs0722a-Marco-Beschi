package auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.model.Utente;

import auth.payload.AuthenticationRequest;
import auth.payload.AuthenticationResponse;
import model.Ruolo;
import service.UtenteService;



@Service
public class AuthenticationService {
	
	@Autowired UtenteService us;
	@Autowired PasswordEncoder pe;
	@Autowired JwtService js;
	@Autowired AuthenticationManager am;
	

	public AuthenticationResponse register(Utente utente) {
		utente.setRuolo(Ruolo.USER);
		utente.setPassword(pe.encode(utente.getPassword()));
		us.save(utente);
		
		String jwtToken = js.generateToken(utente);
		
		return new AuthenticationResponse(jwtToken, utente.getNome(), utente.getCognome(), utente.getEmail());
	}

	public AuthenticationResponse authenticate(AuthenticationRequest request) {
		
		System.out.println(request);
		
		am.authenticate(
				new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
				);
		
		Utente utente = us.findByUsername(request.getUsername());
		String jwtToken = js.generateToken(utente);
		
		return  new AuthenticationResponse(jwtToken, utente.getNome(), utente.getCognome(), utente.getEmail());
	}
	
}

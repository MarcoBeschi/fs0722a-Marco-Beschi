package auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.GestionePrenotazioni.model.Utente;

import auth.payload.AuthenticationRequest;
import auth.payload.AuthenticationResponse;
import auth.service.AuthenticationService;



@Controller
@RequestMapping("/api/auth")
public class AuthenticationController {
	
	@Autowired AuthenticationService as;

	@PostMapping("/register")
	public ResponseEntity<AuthenticationResponse> register(@RequestBody Utente request){
		return ResponseEntity.ok(as.register(request));
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
		return ResponseEntity.ok(as.authenticate(request));
	}
}

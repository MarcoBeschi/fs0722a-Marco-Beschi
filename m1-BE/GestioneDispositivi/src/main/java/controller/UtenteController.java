package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionePrenotazioni.model.Utente;

import service.UtenteService;




@RestController
@RequestMapping("/api/utenti")
public class UtenteController {
	
	@Autowired UtenteService us;

	@GetMapping("/{id}")
	public ResponseEntity<Utente> getUtenteById(@PathVariable Long id){
		return new ResponseEntity<Utente>(us.findById(id), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Utente>> getUtenti(){
		return new ResponseEntity<List<Utente>>(us.findAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUtenteById(@PathVariable Long id){
		us.deleteById(id);		
		return new ResponseEntity<String>("Utente eliminato!!", HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Utente> postUtente(@RequestBody Utente utente){
		
		us.save(utente);
		
		return new ResponseEntity<Utente>(utente, HttpStatus.OK);
	}
	
	@GetMapping("/username-{username}")
	public ResponseEntity<Utente> getUtenteByUsername(@PathVariable String username){
		return new ResponseEntity<Utente>(us.findByUsername(username), HttpStatus.OK);
	}
	
	@GetMapping("/email-{email}")
	public ResponseEntity<Utente> getUtenteByEmail(@PathVariable String email){	
		return new ResponseEntity<Utente>(us.findByEmail(email), HttpStatus.OK);
	}

}

package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.model.Utente;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import repository.UtenteRepository;

@Service
public class UtenteService {
	@Autowired UtenteRepository repo;
	
	public Utente save(Utente arg) {
		
		if(repo.existsByEmail(arg.getEmail()))
			throw new EntityExistsException("L'email: " + arg.getEmail() + " già essiste!");
		if(repo.existsByUsername(arg.getUsername()))
			throw new EntityExistsException("L'username: " + arg.getUsername() + " già essiste!");
		
		return repo.save(arg);
	}
	
	public void delete(Utente arg) {
		repo.delete(arg);
	}
	
	public void deleteById(Long id) {
		Optional<Utente> result =  repo.findById(id);
		if(result.isEmpty())
			throw new EntityNotFoundException("L'utente con id: " + id + " non è stato trovato!");
		repo.deleteById(id);
	}
	
	public Utente findById(Long id){
		Optional<Utente> result =  repo.findById(id);
		if(result.isEmpty())
			throw new EntityNotFoundException("L'utente con id: " + id + " non è stato trovato!");
		return result.get();
	}
	
	public List<Utente> findAll(){
		return repo.findAll();
	}
	
	public Utente findByUsername(String username){
		Optional<Utente> result =  repo.findByUsername(username);
		if(result.isEmpty())
			throw new EntityNotFoundException("L'utente con username: " + username + " non è stato trovato!");
		return result.get();
	}
	
	public Utente findByEmail(String email){
		Optional<Utente> result =  repo.findByEmail(email);
		if(result.isEmpty())
			throw new EntityNotFoundException("L'utente con email: " + email + " non è stato trovato!");
		return result.get();
	}
	
	public boolean existsUtenteByUsername(String username){
		return repo.existsByUsername(username);
	}
	
	public boolean existsUtenteByEmail(String email){
		return repo.existsByEmail(email);
	}
}

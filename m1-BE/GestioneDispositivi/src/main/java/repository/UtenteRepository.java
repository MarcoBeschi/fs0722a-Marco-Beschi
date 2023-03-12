package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestionePrenotazioni.model.Utente;


@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	
	public Optional<Utente> findByUsername(String username);
	
	public Optional<Utente> findByEmail(String email);
	
	public boolean existsByUsername(String username);
	
	public boolean existsByEmail(String email);
	
}

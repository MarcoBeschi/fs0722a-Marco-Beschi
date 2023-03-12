package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Dispositivo;
import model.StatoDispositivo;



@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, Long> {
	
	public Optional<List<Dispositivo>> findByStato(StatoDispositivo statoDispositivo);
}

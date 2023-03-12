package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.persistence.EntityNotFoundException;
import model.Dispositivo;
import model.StatoDispositivo;
import repository.DispositivoRepository;

@Service
public class DispositivoService {
	
	@Autowired DispositivoRepository repo;

	public Dispositivo save(Dispositivo arg) {
		return repo.save(arg);
	}
	
	public void delete(Dispositivo arg) {
		repo.delete(arg);
	}
	
	public void deleteById(Long id) {
		Optional<Dispositivo> result =  repo.findById(id);
		if(result.isEmpty())
			throw new EntityNotFoundException("L'dispositivo con id: " + id + " non è stato trovato!");
		repo.deleteById(id);
	}
	
	public Dispositivo findById(Long id){
		Optional<Dispositivo> result =  repo.findById(id);
		if(result.isEmpty())
			throw new EntityNotFoundException("L'dispositivo con id: " + id + " non è stato trovato!");
		return result.get();
	}
	
	public List<Dispositivo> findAll(){
		return repo.findAll();
	}
	
	public List<Dispositivo> findByStatoDispositivo(String st){
		StatoDispositivo stato = StatoDispositivo.valueOf("DISPOSITIVO_"+ st.toUpperCase());
		Optional<List<Dispositivo>> result =  repo.findByStato(stato);
		if(result.isEmpty())
			throw new EntityNotFoundException("Non sono stati trovati dispositivi con lo stato: " + st);
		return result.get();
	}
}

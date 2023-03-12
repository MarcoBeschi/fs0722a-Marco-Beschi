package runner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.GestionePrenotazioni.model.Utente;

import model.Dispositivo;
import model.Ruolo;
import model.StatoDispositivo;
import model.TipoDispositivo;
import service.DispositivoService;
import service.UtenteService;



@Component
public class TestRunner implements ApplicationRunner {

	@Autowired UtenteService us;
	@Autowired DispositivoService ds;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

		Utente u = new Utente("marcoB", "Marco", "Beschi", "marco@example.com", "1111", Ruolo.ADMIN);
		Dispositivo d = new Dispositivo(TipoDispositivo.SMARTPHONE, StatoDispositivo.DISPOSITIVO_ASSEGNATO);
		
		d.setUtente(u);
		
		if(ds.findById(1l).equals(null)) ds.save(d);
		 
		if(us.findByUsername("n.badea").equals(null)) us.save(u);		
		
	}

}

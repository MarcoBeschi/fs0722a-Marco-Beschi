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

import model.Dispositivo;
import service.DispositivoService;


@RestController
@RequestMapping("/api/dispositivi")
public class DispositivoController {
	@Autowired DispositivoService ds;

	@GetMapping("/{id}")
	public ResponseEntity<Dispositivo> getDispositivoById(@PathVariable Long id){
		return new ResponseEntity<Dispositivo>(ds.findById(id), HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<Dispositivo>> getDispositivi(){
		return new ResponseEntity<List<Dispositivo>>(ds.findAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDispositivoById(@PathVariable Long id){
		ds.deleteById(id);
		return new ResponseEntity<String>("Dispositivo eliminato!!", HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<Dispositivo> postDispositivo(@RequestBody Dispositivo dispositivo){
		return new ResponseEntity<Dispositivo>(ds.save(dispositivo), HttpStatus.OK);
	}
	
	@GetMapping("/stato-{stato}")
	public ResponseEntity<List<Dispositivo>> getDispositivoById(@PathVariable String stato){
		return new ResponseEntity<List<Dispositivo>>(ds.findByStatoDispositivo(stato),HttpStatus.OK);
	}
}

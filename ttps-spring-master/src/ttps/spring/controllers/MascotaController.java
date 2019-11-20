package ttps.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model.Mascota;
import ttps.spring.services.MascotaService;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
	
	@Autowired
	private MascotaService mascotaService;
	
	@GetMapping
	public ResponseEntity<List<Mascota>> listAllMascotas() {
		
		List<Mascota> users = mascotaService.ObtenerMascotaPorDueño(0);
		if (users.isEmpty()) {
			return new ResponseEntity<List<Mascota>>(HttpStatus.NO_CONTENT);
		}
		
		List<Mascota> mascotas = new ArrayList<Mascota>();
		
		return new ResponseEntity<List<Mascota>>(mascotas, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Mascota> crearMascota(@RequestBody Mascota mascota){
		
		if(mascota.getRaza() == null) {
			return new ResponseEntity<Mascota>(HttpStatus.BAD_REQUEST);
		}
		if(mascota.getDuenio() == null) {
			return new ResponseEntity<Mascota>(HttpStatus.BAD_REQUEST);
		}
		
		// creo la mascota
		Mascota m = this.mascotaService.CrearMascota(mascota);
		
		return new ResponseEntity<Mascota>(m, HttpStatus.CREATED);
	}
	
}

package ttps.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import ttps.spring.model.Mascota;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
	
	//@GetMapping
	//public ResponseEntity<List<Mascota>> listAllMascotas() {
		//List<User> users = userService.findAllUsers();
		//if (users.isEmpty()) {
		//	return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		//}
		
		//List<Mascota> mascotas = new ArrayList<Mascota>();
		
		//return new ResponseEntity<List<Mascota>>(mascotas, HttpStatus.OK);
	//}
	
}

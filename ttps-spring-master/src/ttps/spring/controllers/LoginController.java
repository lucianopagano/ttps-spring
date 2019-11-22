package ttps.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.dto.LoginDto;
import ttps.spring.dto.VeterinarioDto;
import ttps.spring.dto.InformacionPersonalDto;
import ttps.spring.dto.AdministradorDto;
import ttps.spring.dto.DuenioDto;
import ttps.spring.model.Usuario;
import ttps.spring.services.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping
	public ResponseEntity<InformacionPersonalDto> Login(@RequestBody LoginDto datosLogin)
	{
		if(datosLogin == null ||  datosLogin.getUsuario() == null || datosLogin.getPassword() == null)
			return new ResponseEntity<InformacionPersonalDto>(HttpStatus.BAD_REQUEST);		
		
		Usuario usuarioLogueado = loginService.Ingresar(datosLogin);		
		
		InformacionPersonalDto tipoUsuario;
		
		if(usuarioLogueado == null) 
			return new ResponseEntity<InformacionPersonalDto>(HttpStatus.UNAUTHORIZED);
		
		switch (usuarioLogueado.getTipo().getDescripcion()) {
		case "Dueno":	
			tipoUsuario = new DuenioDto(usuarioLogueado);
			break;
			
		case "Veterinario":	
			tipoUsuario = new VeterinarioDto(usuarioLogueado);		
			break;	
		default: 
			tipoUsuario = new AdministradorDto(usuarioLogueado);			
		}		
		
		return new ResponseEntity<InformacionPersonalDto>(tipoUsuario, HttpStatus.OK);
	
	}	
}

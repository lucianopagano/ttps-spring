package ttps.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.model.Usuario;
import ttps.spring.services.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping
	public ResponseEntity<Usuario> Login(@RequestBody Usuario usuario)
	{
		Usuario usuarioLogueado = loginService.Login(usuario.getNombreUsuario(), usuario.getContrasena());
		
		if(usuarioLogueado == null) 
			return new ResponseEntity<Usuario>(HttpStatus.UNAUTHORIZED);
		
		
		return new ResponseEntity<Usuario>(usuarioLogueado, HttpStatus.OK);
	
	}
	
}

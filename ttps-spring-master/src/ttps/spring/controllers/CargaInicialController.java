package ttps.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.services.MascotaService;

@RestController
@RequestMapping("/CargaInicial")
public class CargaInicialController {
	
	@Autowired
	private MascotaService mascotaService;
	
	@GetMapping
	public void CargaInicial() {
		mascotaService.CargaInicial();
	}
	
	
}

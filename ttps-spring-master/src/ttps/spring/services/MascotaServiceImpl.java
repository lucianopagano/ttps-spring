package ttps.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.daos.EspecieDAO;
import ttps.spring.daos.MascotaDAO;
import ttps.spring.daos.NombreCampoDAO;
import ttps.spring.daos.RazaDAO;
import ttps.spring.daos.TipoUsuarioDAO;
import ttps.spring.daos.UsuarioDAO;
import ttps.spring.model.CampoFicha;
import ttps.spring.model.Especie;
import ttps.spring.model.Mascota;
import ttps.spring.model.NombreCampo;
import ttps.spring.model.Raza;
import ttps.spring.model.TipoUsuario;
import ttps.spring.model.Usuario;

@Service
public class MascotaServiceImpl implements MascotaService {

	@Autowired
	MascotaDAO mascotaDao;
	
	@Autowired
	EspecieDAO especieDAO;
	
	@Autowired
 	RazaDAO razaDAO;
	
	@Autowired
	UsuarioDAO usuarioDao;
	
	@Autowired
	TipoUsuarioDAO tipoUsuarioDAO;
	
	@Autowired
	NombreCampoDAO campoDao;
	
	
	@Override
	public Mascota CrearMascota(Mascota mascotaACrear) {
		
		// recupero la raza
		Raza raza = razaDAO.recuperar(mascotaACrear.getRaza().getId()); 
				//razaDAO.recuperarPorNombreDescripcion(Raza.class, "descripcion", "Labrador");
		
		Usuario duenio = usuarioDao.recuperar(mascotaACrear.getDuenio().getId());
		
		Mascota nuevaMascota = new Mascota(raza);
		nuevaMascota.setDuenio(duenio);
		
		//creo todos los campo ficha necesarios uno por uno
		List<CampoFicha> fichaNuevoPerro = new ArrayList<CampoFicha>();
		
		for (CampoFicha campo : mascotaACrear.getCampoFicha()) 
		{ 
		    NombreCampo campoNombre = campoDao.recuperarPorNombreDescripcion(NombreCampo.class, "nombre", campo.getCampo().getNombre());
			
		    CampoFicha campoACrear = new CampoFicha(nuevaMascota, campoNombre,campo.getVisibilidad(),campo.getValor());
		    
		    fichaNuevoPerro.add(campoACrear);
		} 
		
		nuevaMascota.setFicha(fichaNuevoPerro);
	 	
	 	return mascotaDao.persistir(nuevaMascota);
	 	
	}
	
	@Override
	public List<Mascota> ObtenerMascotaPorDueño(int dueñoId) {
		
		mascotaDao.recuperarTodos(null);
		
		// TODO Auto-generated method stub
		return new ArrayList<Mascota>();
	}
	
	@Override
	public void CargaInicial() {
		Especie perro 	= new Especie("Perro");
		Especie gato 	= new Especie("Gato");
		Especie ave 	= new Especie("Ave");
		
		//Guardo las Especies
		especieDAO.persistir(perro);
		especieDAO.persistir(gato);
		especieDAO.persistir(ave);
		
		List<Raza> razas = new ArrayList<Raza>();
		
		Raza perro1 = new Raza("Labrador", perro);
		razas.add(perro1);
		
		Raza perro2 = new Raza("Chihuahua",perro);
		razas.add(perro2);
		
		Raza perro3 = new Raza("Dogo",perro);
		razas.add(perro3);
		
		Raza perro4 = new Raza("Pitbull",perro);
		razas.add(perro4);
		
		Raza perro5 = new Raza("Mestizo",perro);
		razas.add(perro5);
		
		Raza gato1 = new Raza("Siames",gato);
		razas.add(gato1);
		
		Raza gato2 = new Raza("Persa",gato);
		razas.add(gato2);
		
		Raza gato3 = new Raza("Bengala",gato);
		razas.add(gato3);
				
		Raza ave1 = new Raza("Loro",ave);
		razas.add(ave1);
		
		Raza ave2 = new Raza("Papagayo",ave);
		razas.add(ave2);
		
		Raza ave3 = new Raza("Canario",ave);
		razas.add(ave3);
		
		//Guardo las razas
		for(Raza r : razas)
		{
			razaDAO.persistir(r);
		}
		
		TipoUsuario tipoUsuario1 = new TipoUsuario("Administrador");
		tipoUsuarioDAO.persistir(tipoUsuario1);
		TipoUsuario tipoUsuario2 = new TipoUsuario("Veterinario");
		tipoUsuarioDAO.persistir(tipoUsuario2);
		TipoUsuario tipoUsuario3 = new TipoUsuario("Dueno");
		tipoUsuarioDAO.persistir(tipoUsuario3);	
		
		
		NombreCampo campoNombre 		= new NombreCampo("Nombre");
		NombreCampo campoFecha 			= new NombreCampo("FechaNacimiento");
		NombreCampo campoSexo 			= new NombreCampo("Sexo");
		NombreCampo campoColor 			= new NombreCampo("Color");
		NombreCampo campoSenia 			= new NombreCampo("Señas Particulares");
		NombreCampo campoVeterinario 	= new NombreCampo("Veterinario");
		
		campoDao.persistir(campoNombre);
		campoDao.persistir(campoFecha);
		campoDao.persistir(campoSexo);
		campoDao.persistir(campoColor);
		campoDao.persistir(campoSenia);
		campoDao.persistir(campoVeterinario);
		
		TipoUsuario duenio 		  = tipoUsuarioDAO.recuperarPorNombreDescripcion(TipoUsuario.class, "descripcion", "Dueno");
		
		
		Usuario duenioDe2Mascotas 	= new Usuario("juan", "1234", "Juan", "Alvarez", "221532355", "juanalvarez@gmail.com", duenio);
		usuarioDao.persistir(duenioDe2Mascotas);
	}
	
	
}

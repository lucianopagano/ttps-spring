package ttps.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.daos.EspecieDAO;
import ttps.spring.daos.MascotaDAO;
import ttps.spring.daos.NombreCampoDAO;
import ttps.spring.daos.RazaDAO;
import ttps.spring.daos.TipoUsuarioDAO;
import ttps.spring.daos.UsuarioDAO;
import ttps.spring.dto.InformacionMascotaDto;
import ttps.spring.dto.NuevaMascotaDto;
import ttps.spring.dto.VeterinarioDto;
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
		
		Raza raza = razaDAO.recuperar(mascotaACrear.getRaza().getId()); 
		
		Usuario duenio = usuarioDao.recuperar(mascotaACrear.getDuenio().getId());
		
		Mascota nuevaMascota = new Mascota(raza);
		nuevaMascota.setDuenio(duenio);
		
		List<CampoFicha> fichaNuevoPerro = new ArrayList<CampoFicha>();
		
		for (CampoFicha campo : mascotaACrear.getCampoFicha()) 
		{ 
		    NombreCampo campoNombre = campoDao.recuperarPorNombreDescripcion("nombre", campo.getCampo().getNombre());
			
		    CampoFicha campoACrear = new CampoFicha(nuevaMascota, campoNombre,campo.getVisibilidad(),campo.getValor());
		    
		    fichaNuevoPerro.add(campoACrear);
		} 
		
		nuevaMascota.setFicha(fichaNuevoPerro);
	 	
	 	return mascotaDao.persistir(nuevaMascota);
	 	
	}
	
	@Override
	public List<Mascota> ObtenerMascotaPorDueno(int duenioId) {
		List<Mascota> mascotas = this.ObtenerTodasLasMascotas();
		if (mascotas.size() > 0) {
			List<Mascota> mascotaDuenio = mascotas.stream().filter(t -> t.getDuenio().getId() == duenioId).collect(Collectors.toList());
			return mascotaDuenio;
		}
		 
		return null;
	}
	
	@Override
	public List<Mascota> ObtenerPacientesVeterinario(int veterinarioId) {
		List<Mascota> mascotas = this.ObtenerTodasLasMascotas();
		if (mascotas.size() > 0) {
			List<Mascota> mascotaDuenio = mascotas.stream().filter(t -> t.getVeterinario().getId() == veterinarioId).collect(Collectors.toList());
			return mascotaDuenio;
		}
		 
		return null;
	}

	@Override
	public List<Mascota> ObtenerTodasLasMascotas() {
		return mascotaDao.recuperarTodos(null);
	}
	
	@Override
	public List<Especie> ObtenerTodasLasEspecies()
	{
		return especieDAO.recuperarTodos(null);
	}
	
	@Override
	public List<Raza> ObtenerRazasPorEspecie(int idEspecie)
	{
		return razaDAO.ObtenerRazasPorEspecie(idEspecie);
	}
	
	@Override
	public List<Raza> ObtenerTodasLasRazas()
	{
		return razaDAO.recuperarTodos(null);
	}

	@Override
	public Mascota RegistrarMascota(Mascota nuevaMascota, NuevaMascotaDto infoMascota) {
				
		List<CampoFicha> ficha = new ArrayList<CampoFicha>();
        
		NombreCampo campoNombre = campoDao.recuperarPorNombreDescripcion("nombre", "Nombre");		
	    CampoFicha fichaNombre = new CampoFicha(nuevaMascota, campoNombre, true, infoMascota.getNombre());	    
	    ficha.add(fichaNombre);
		
	    NombreCampo campoColor = campoDao.recuperarPorNombreDescripcion("nombre", "Color");		
	    CampoFicha fichaColor = new CampoFicha(nuevaMascota, campoColor, true, infoMascota.getColor());	    
	    ficha.add(fichaColor);
	    
	    NombreCampo campoSenasParticulares = campoDao.recuperarPorNombreDescripcion("nombre", "SenasParticulares");		
	    CampoFicha fichaSenasParticulares = new CampoFicha(nuevaMascota, campoSenasParticulares, true, infoMascota.getSenasParticulares());	    
	    ficha.add(fichaSenasParticulares);
	    
	    NombreCampo campoFechaNacimiento = campoDao.recuperarPorNombreDescripcion("nombre", "FechaNacimiento");		
	    CampoFicha fichaFechaNacimiento = new CampoFicha(nuevaMascota, campoFechaNacimiento, true, infoMascota.getFechanacimiento());	    
	    ficha.add(fichaFechaNacimiento);
	    
	    NombreCampo campoSexo = campoDao.recuperarPorNombreDescripcion("nombre", "Sexo");		
	    CampoFicha fichaSexo = new CampoFicha(nuevaMascota, campoSexo, true, infoMascota.getSexo());	    
	    ficha.add(fichaSexo);
        
        nuevaMascota.setFicha(ficha);
        
        return mascotaDao.RegistrarMascota(nuevaMascota);
	}
	
	@Override
	public Raza ObtenerRaza(String idRaza)
	{
		return razaDAO.recuperar(idRaza);
	}
}

package ttps.spring.services;

import java.util.List;

import ttps.spring.dto.InformacionMascotaDto;
import ttps.spring.model.Especie;
import ttps.spring.model.Mascota;
import ttps.spring.model.Raza;

public interface MascotaService {

	//void CargaInicial();
	
	Mascota CrearMascota(Mascota mascotaACrear);
	
	Mascota RegistrarMascota(Mascota nuevaMascota, InformacionMascotaDto infoMascota);
	
	List<Mascota> ObtenerMascotaPorDueno(int duenoId);
	
	List<Mascota> ObtenerTodasLasMascotas();
	
	List<Especie> ObtenerTodasLasEspecies();
	
	List<Raza> ObtenerRazasPorEspecie(int idEspecie);
	
	List<Mascota> ObtenerPacientesVeterinario(int veterinarioId);
	
	List<Raza> ObtenerTodasLasRazas();
}

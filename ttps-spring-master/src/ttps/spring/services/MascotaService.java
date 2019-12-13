package ttps.spring.services;

import java.util.List;

import ttps.spring.model.Especie;
import ttps.spring.model.Mascota;
import ttps.spring.model.Raza;

public interface MascotaService {

	//void CargaInicial();
	
	Mascota CrearMascota(Mascota mascotaACrear);
	
	List<Mascota> ObtenerMascotaPorDueno(int duenoId);
	
	List<Mascota> ObtenerTodasLasMascotas();
	
	List<Especie> ObtenerTodasLasEspecies();
	
	List<Raza> ObtenerRazasPorEspecie(int idEspecie);
	
	List<Mascota> ObtenerPacientesVeterinario(int veterinarioId);
	
	List<Raza> ObtenerTodasLasRazas();
	
	Raza ObtenerRaza(int idRaza);
}

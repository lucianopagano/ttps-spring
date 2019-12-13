package ttps.spring.impDaos;

import org.springframework.stereotype.Repository;

import ttps.spring.daos.*;
import ttps.spring.model.*;


@Repository(value = "MascotaDAO")
public class MascotaDAOHibernateJPA extends GenericDAOHibernateJPA<Mascota> implements MascotaDAO {
	public MascotaDAOHibernateJPA() {
		super(Mascota.class);
	}

	@Override
	public Mascota RegistrarMascota(Mascota mascota) {
		Mascota nuevaMascota = new Mascota();

		nuevaMascota.setDuenio(mascota.getDuenio());
		nuevaMascota.setRaza(mascota.getRaza());
		nuevaMascota.setVeterinario(mascota.getVeterinario());
		nuevaMascota.setCampoFicha(mascota.getCampoFicha());	
		
		this.getEntityManager().persist(nuevaMascota);
		 return nuevaMascota;
	}	
}
package ttps.spring.impDaos;

import ttps.spring.daos.*;
import ttps.spring.model.*;



public class MascotaDAOHibernateJPA extends GenericDAOHibernateJPA<Mascota> implements MascotaDAO {
	public MascotaDAOHibernateJPA() {
		super(Mascota.class);
	}

	
	
}
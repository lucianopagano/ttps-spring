package ttps.spring.impDaos;

import ttps.spring.daos.*;
import ttps.spring.model.*;



public class InformacionDAOHibernateJPA extends GenericDAOHibernateJPA<Informacion> implements InformacionDAO {
	public InformacionDAOHibernateJPA() {
		super(Informacion.class);
	}

	
	@Override
	public Informacion recuperarInformacion(int id) 
	{
		return this.recuperar(id);
	}
}
package ttps.spring.impDaos;

import ttps.spring.daos.*;
import ttps.spring.model.*;



public class NombreCampoDAOHibernateJPA extends GenericDAOHibernateJPA<NombreCampo> implements NombreCampoDAO {
	public NombreCampoDAOHibernateJPA() {
		super(NombreCampo.class);
	}

	
	
}
package ttps.spring.impDaos;

import ttps.spring.daos.*;
import ttps.spring.model.*;



public class CampoFichaDAOHibernateJPA extends GenericDAOHibernateJPA<CampoFicha> implements CampoFichaDAO {
	public CampoFichaDAOHibernateJPA() {
		super(CampoFicha.class);
	}

	
	
}
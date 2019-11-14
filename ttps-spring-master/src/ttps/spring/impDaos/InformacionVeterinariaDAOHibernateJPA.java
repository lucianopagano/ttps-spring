package ttps.spring.impDaos;

import ttps.spring.daos.*;
import ttps.spring.model.*;



public class InformacionVeterinariaDAOHibernateJPA extends GenericDAOHibernateJPA<InformacionVeterinaria> implements InformacionVeterinariaDAO {
	public InformacionVeterinariaDAOHibernateJPA() {
		super(InformacionVeterinaria.class);
	}

	
	
}
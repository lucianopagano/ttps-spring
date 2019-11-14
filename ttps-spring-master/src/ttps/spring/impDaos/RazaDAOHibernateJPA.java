package ttps.spring.impDaos;

import ttps.spring.daos.*;
import ttps.spring.model.*;



public class RazaDAOHibernateJPA extends GenericDAOHibernateJPA<Raza> implements RazaDAO {
	public RazaDAOHibernateJPA() {
		super(Raza.class);
	}

	
	
}
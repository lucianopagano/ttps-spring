package ttps.spring.impDaos;

import ttps.spring.daos.*;
import ttps.spring.model.*;



public class EventoDAOHibernateJPA extends GenericDAOHibernateJPA<Evento> implements EventoDAO {
	public EventoDAOHibernateJPA() {
		super(Evento.class);
	}

	
	
}
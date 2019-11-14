package ttps.spring.impDaos;

import ttps.spring.daos.*;
import ttps.spring.model.*;



public class TipoUsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<TipoUsuario> implements TipoUsuarioDAO {
	public TipoUsuarioDAOHibernateJPA() {
		super(TipoUsuario.class);
	}

	
	
}
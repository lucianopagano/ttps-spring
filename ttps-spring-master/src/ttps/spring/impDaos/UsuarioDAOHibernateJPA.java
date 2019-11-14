package ttps.spring.impDaos;

import ttps.spring.daos.*;
import ttps.spring.model.*;



public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}

	
	
}
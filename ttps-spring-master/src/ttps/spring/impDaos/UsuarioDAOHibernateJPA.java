package ttps.spring.impDaos;

import org.springframework.stereotype.Repository;

import ttps.spring.daos.*;
import ttps.spring.model.*;


@Repository
public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}

	
	
}
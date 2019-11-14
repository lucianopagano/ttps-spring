package ttps.spring.impDaos;

import org.springframework.stereotype.Repository;

import ttps.spring.daos.*;
import ttps.spring.model.*;


@Repository
public class TipoUsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<TipoUsuario> implements TipoUsuarioDAO {
	public TipoUsuarioDAOHibernateJPA() {
		super(TipoUsuario.class);
	}

	
	
}
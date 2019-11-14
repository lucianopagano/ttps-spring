package ttps.spring.impDaos;
import javax.persistence.Query;

import ttps.spring.daos.*;
import ttps.spring.model.*;

public class TipoEventoDAOHibernateJPA extends GenericDAOHibernateJPA<TipoEvento> implements TipoEventoDAO {
	public TipoEventoDAOHibernateJPA() {
		super(TipoEvento.class);
	}
	
	public TipoEvento recuperarPorDescripcion(String descripcion) {
		Query consulta= EMF.getEMF().createEntityManager().createQuery
				("SELECT e FROM " +  getPersistentClass().getName() +" e WHERE e.descripcion='"+ descripcion+"'" );	
		
		TipoEvento resultado = (TipoEvento) consulta.getSingleResult();
		return resultado;
	}	
}
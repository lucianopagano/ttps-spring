package ttps.spring.impDaos;

import javax.persistence.Query;


import ttps.spring.daos.*;
import ttps.spring.model.*;

public class EspecieDAOHibernateJPA extends GenericDAOHibernateJPA<Especie> implements EspecieDAO {
	public EspecieDAOHibernateJPA() {
		super(Especie.class);
	}
	
	public Especie recuperarPorDescripcion(String descripcion) {
		Query consulta= EMF.getEMF().createEntityManager().createQuery
				("SELECT e FROM " +  getPersistentClass().getName() +" e WHERE e.descripcion='"+ descripcion+"'" );
	
		
		Especie resultado = (Especie) consulta.getSingleResult();
		return resultado;
	}	
}
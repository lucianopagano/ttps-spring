package ttps.spring.impDaos;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ttps.spring.daos.*;
import ttps.spring.model.*;


@Repository
public class RazaDAOHibernateJPA extends GenericDAOHibernateJPA<Raza> implements RazaDAO {
	public RazaDAOHibernateJPA() {
		super(Raza.class);
	}

	public List<Raza> ObtenerRazasPorEspecie(int idEspecie)
	{
		Query consulta= this.getEntityManager().createQuery
				("SELECT r FROM " +  getPersistentClass().getName() 
						+" r WHERE r.especie.id ='" + idEspecie+"'");
	
		@SuppressWarnings("unchecked")
		List<Raza> resultado = (List<Raza>) consulta.getResultList();
		if(!resultado.isEmpty())
		{
			return resultado;
		}
		
		return null;
	}
	
}
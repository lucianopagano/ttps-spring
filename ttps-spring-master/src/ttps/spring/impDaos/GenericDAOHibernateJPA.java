package ttps.spring.impDaos;

import java.io.Serializable;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import ttps.spring.daos.*;


public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {
	
	protected Class<T> persistentClass;

	public GenericDAOHibernateJPA(Class<T> clase) {
		persistentClass = clase;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Override
	public T persistir(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(entity);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive())
				tx.rollback();
			throw e;
		} finally {
			em.close();
		}
		return entity;
	}
	
	@Override
	public T actualizar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		T entityLocal = em.merge(entity);
		etx.commit();
		em.close();
		return entityLocal;
	}

	@Override
	public void borrar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.remove(em.contains(entity) ? entity : em.merge(entity));
//			em.remove(entity);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive())
				tx.rollback();
			throw e; // escribir en un log o mostrar un mensaje
		} finally {
			em.close();
		}
	}
	
	@Override
	public T borrar(Serializable id) {
		T entity = EMF.getEMF().createEntityManager().find(this.getPersistentClass(), id);
		if (entity != null) {
			this.borrar(entity);
		}
		return entity;
	}

	@Override
	public List<T> recuperarTodos(String columnOrder) {
		Query consulta= EMF.getEMF().createEntityManager().createQuery("select e from " + getPersistentClass().getSimpleName()+" e order by e."+columnOrder);
		@SuppressWarnings("unchecked")
		List<T> resultado = (List<T>)consulta.getResultList();
		return resultado;
	}

	@Override
	public boolean existe(Serializable id) {
		
				String query ="SELECT "
						+ "CASE WHEN (count(e.id) > 0) THEN  true ELSE false END "
						+ "FROM "+ getPersistentClass().getName() +" e "
						+ "WHERE e.id = "+ id ;
				TypedQuery<Boolean> booleanQuery = EMF.getEMF().createEntityManager().createQuery(query, Boolean.class);
				boolean exists = booleanQuery.getSingleResult();
				
				return exists;
	}

	@Override
	public T recuperar(Serializable id) {
		Query consulta= EMF.getEMF().createEntityManager().createQuery
				("SELECT e FROM " +  getPersistentClass().getName() +" e WHERE e.id="+ id );
	
		@SuppressWarnings("unchecked")
		T resultado = (T) consulta.getSingleResult();
		return resultado;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public T recuperarPorNombreDescripcion(Class entidad, String campo, String valor)
	{
		EntityManager entityManager = EMF.getEMF().createEntityManager();
		
		Query consulta= entityManager.createQuery
				("SELECT e FROM " +  getPersistentClass().getName() +" e WHERE e."+ campo  +"= '"+ valor +"'" );
	    
		@SuppressWarnings("unchecked")
		T resultado = (T) consulta.getSingleResult();
		return resultado;
	}
}
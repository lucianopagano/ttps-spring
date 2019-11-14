package ttps.spring.daos;

import ttps.spring.model.*;

public interface EspecieDAO extends GenericDAO<Especie> 
{
	Especie recuperarPorDescripcion(String descripcion);
}

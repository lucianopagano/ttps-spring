package ttps.spring.daos;

import ttps.spring.model.*;

public interface TipoEventoDAO extends GenericDAO<TipoEvento> 
{
	TipoEvento recuperarPorDescripcion(String descripcion);
}

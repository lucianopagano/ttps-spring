package ttps.spring.daos;

import ttps.spring.model.*;

public interface InformacionDAO extends GenericDAO<Informacion> {
	
	public Informacion recuperarInformacion(int id);

}

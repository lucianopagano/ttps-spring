package ttps.spring.daos;

import java.util.List;

import org.springframework.stereotype.Repository;

import ttps.spring.model.*;

@Repository
public interface RazaDAO extends GenericDAO<Raza> 
{
	List<Raza> ObtenerRazasPorEspecie(int idEspecie);
}

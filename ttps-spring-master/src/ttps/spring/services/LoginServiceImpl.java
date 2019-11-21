package ttps.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.daos.TipoUsuarioDAO;
import ttps.spring.daos.UsuarioDAO;
import ttps.spring.model.Usuario;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UsuarioDAO usuarioDao;
	
	@Autowired
	TipoUsuarioDAO tipoUsuarioDao;
	
	@Override
	public Usuario Login(String user,String pass)
	{
		Usuario usuario = usuarioDao.ObtenerUsuario(user, pass);
		if(usuario != null)
		{
				return usuario;
		}
		
		return null;
	}

}

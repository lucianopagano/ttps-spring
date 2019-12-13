package ttps.spring.controllers;
 
 
import java.util.ArrayList;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import ttps.spring.dto.IdentityDto;
import ttps.spring.dto.InformacionMascotaDto;
import ttps.spring.dto.MascotaDto;
import ttps.spring.dto.NuevaMascotaDto;
import ttps.spring.dto.RazaEspecieDto;
import ttps.spring.dto.VeterinarioDto;
import ttps.spring.model.CampoFicha;
import ttps.spring.model.Especie;
import ttps.spring.model.Mascota;
import ttps.spring.model.NombreCampo;
import ttps.spring.model.Raza;
import ttps.spring.model.Usuario;
import ttps.spring.services.MascotaService;
import ttps.spring.services.UsuarioService;
 
@RestController
public class MascotaController {
   
    @Autowired
    private MascotaService mascotaService;
   
    @Autowired
    private UsuarioService usuarioService;
   
    @Autowired
    private HttpServletRequest request;
   
    @GetMapping("/mascotas/{id}")
    public ResponseEntity<List<Mascota>> listarMascotasDuenio(@PathVariable int id) {
                   
            List<Mascota> mascotasDuenio = mascotaService.ObtenerMascotaPorDueno(id);
 
            if (mascotasDuenio != null && !mascotasDuenio.isEmpty() ) {
                return new ResponseEntity<List<Mascota>>(mascotasDuenio, HttpStatus.OK);
            }
           
            return new ResponseEntity<List<Mascota>>(HttpStatus.NO_CONTENT);
               
       
    }
    
    //Obtiene todas las mascotas y sin seguridad
    @GetMapping("/mascotas")
  	public ResponseEntity<List<InformacionMascotaDto>> obtenerMascotas()
  	{
  		List<Mascota> mascotas = mascotaService.ObtenerTodasLasMascotas();
  		if (mascotas != null && !mascotas.isEmpty() ) 
  		{
  			List<InformacionMascotaDto> infoMascotas = new ArrayList<InformacionMascotaDto>();
  			for (Mascota unaMascota : mascotas) {
                infoMascotas.add(new InformacionMascotaDto(unaMascota));
               
            }
  			
  			return new ResponseEntity<List<InformacionMascotaDto>>(infoMascotas, HttpStatus.OK);
  		
  		}
  		
  		return new ResponseEntity<List<InformacionMascotaDto>>(HttpStatus.NO_CONTENT);	
  		
  	}
  	
  	@GetMapping("/especies")
  	public ResponseEntity<List<Especie>> obtenerEspecies()
  	{
  		List<Especie> especies = mascotaService.ObtenerTodasLasEspecies();
  	
  		if (especies != null && !especies.isEmpty() ) 
  		{
  			return new ResponseEntity<List<Especie>>(especies, HttpStatus.OK);
  		}
  		
  		return new ResponseEntity<List<Especie>>(HttpStatus.NO_CONTENT);	
  		
  	}
  	
  	@GetMapping("/razas/{idEspecie}")
  	public ResponseEntity<List<Raza>> obtenerRazasPorEspecie(@PathVariable int idEspecie)
  	{
  		List<Raza> razas = mascotaService.ObtenerRazasPorEspecie(idEspecie);
  	
  		if (razas != null && !razas.isEmpty() ) 
  		{
  			return new ResponseEntity<List<Raza>>(razas, HttpStatus.OK);
  		}
  		
  		return new ResponseEntity<List<Raza>>(HttpStatus.NO_CONTENT);	
  		
  	}
  	
  	@GetMapping("/raza/{id}")
  	public ResponseEntity<Raza> obtenerRaza(@PathVariable String id)
  	{
  		Raza raza = mascotaService.ObtenerRaza(id);
  	
  		if (raza != null) 
  		{
  			return new ResponseEntity<Raza>(raza, HttpStatus.OK);
  		}
  		
  		return new ResponseEntity<Raza>(HttpStatus.NO_CONTENT);	
  		
  	}
  	
  	
  	@GetMapping("/razas")
  	public ResponseEntity<List<RazaEspecieDto>> obtenerTodasLasRazas()
  	{
  		List<Raza> razas = mascotaService.ObtenerTodasLasRazas();
  	
  		if (razas != null && !razas.isEmpty() ) 
  		{
  			List<RazaEspecieDto> especiesRazas = new ArrayList<RazaEspecieDto>();
            
            for (Raza unaRaza : razas) {
            	especiesRazas.add(new RazaEspecieDto(unaRaza));
               
            }
  			
  			
  			return new ResponseEntity<List<RazaEspecieDto>>(especiesRazas, HttpStatus.OK);
  		}
  		
  		return new ResponseEntity<List<RazaEspecieDto>>(HttpStatus.NO_CONTENT);	
  		
  	}
  	
  	
   
    @PostMapping
    @RequestMapping("/mascota")
    public ResponseEntity<Mascota> crearMascota(@RequestBody Mascota mascota){
                   
            if(mascota.getRaza() == null) {
                return new ResponseEntity<Mascota>(HttpStatus.BAD_REQUEST);
            }
           
            if(mascota.getDuenio() == null) {
                return new ResponseEntity<Mascota>(HttpStatus.BAD_REQUEST);
            }
       
            Mascota m = this.mascotaService.CrearMascota(mascota);
       
            return new ResponseEntity<Mascota>(m, HttpStatus.CREATED);
    }
    
    @PostMapping
    @RequestMapping("/nuevamascota")
    public ResponseEntity<Mascota> agregarMascota(@RequestBody NuevaMascotaDto infoMascota){   	
    	
    	Usuario duenio = usuarioService.ObtenerUsuario(String.valueOf(infoMascota.getIdDueno()));
    	Usuario veterinario = usuarioService.ObtenerUsuario(String.valueOf(infoMascota.getIdVeterinario()));
    	Raza raza = mascotaService.ObtenerRaza(infoMascota.getRaza());
    			
            if(veterinario == null || duenio == null || raza == null) {
                return new ResponseEntity<Mascota>(HttpStatus.BAD_REQUEST);
            }
            
            Mascota mascota = new Mascota();
            mascota.setDuenio(duenio);
            mascota.setVeterinario(veterinario);   
            mascota.setRaza(raza);     
            
            Mascota m = this.mascotaService.RegistrarMascota(mascota, infoMascota);
       
            return new ResponseEntity<Mascota>(mascota, HttpStatus.CREATED);
    }
   
    @GetMapping
    @RequestMapping("/veterinarios")
    public ResponseEntity<List<VeterinarioDto>> obtenerVeterinarios(){
                   
            List<Usuario> listadoVeterinarios = usuarioService.ObtenerVeterinarios();
            List<VeterinarioDto> veterinarios = new ArrayList<VeterinarioDto>();
           
            for (Usuario unUsuario : listadoVeterinarios) {
                veterinarios.add(new VeterinarioDto(unUsuario));
               
            }
       
            return new ResponseEntity<List<VeterinarioDto>>(veterinarios, HttpStatus.OK);
    }
   
    @GetMapping
    @RequestMapping("/mismascotas/{id}")
    public ResponseEntity<List<InformacionMascotaDto>> obtenerInformacionMascotas(@PathVariable int id){
                   
            List<Mascota> listadoMascotas = mascotaService.ObtenerMascotaPorDueno(id);
            List<InformacionMascotaDto> infoMascotas = new ArrayList<InformacionMascotaDto>();
           
            for (Mascota unaMascota : listadoMascotas) {
                infoMascotas.add(new InformacionMascotaDto(unaMascota));
               
            }
       
            return new ResponseEntity<List<InformacionMascotaDto>>(infoMascotas, HttpStatus.OK);
    }
   
}
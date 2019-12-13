package ttps.spring.dto;

import ttps.spring.model.CampoFicha;
import ttps.spring.model.Mascota;
	
public class InformacionMascotaDto {
	private String nombre;
	private String raza;
	private String fechanacimiento;
	private int idVeterinario;
	private int idDueno;
	private String senasParticulares;
	private String color;
	private String sexo;
	private String urlImagen;
	
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public int getIdVeterinario() {
		return idVeterinario;
	}
	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}
	public int getIdDueno() {
		return idDueno;
	}
	public void setIdDueno(int idDueno) {
		this.idDueno = idDueno;
	}
	public String getSenasParticulares() {
		return senasParticulares;
	}
	public void setSenasParticulares(String senasParticulares) {
		this.senasParticulares = senasParticulares;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

	public InformacionMascotaDto(Mascota unaMascota) {
		for (CampoFicha unCampo : unaMascota.getCampoFicha()) {
			
			switch (unCampo.getCampo().getNombre()) {
			case "Nombre":
				this.nombre = unCampo.getValor();
				break;
			case "FechaNacimiento":
				this.fechanacimiento = unCampo.getValor();
				break;
			case "Color":
				this.color = unCampo.getValor();
				break;
			case "SenasParticulares":
				this.senasParticulares = unCampo.getValor();
				break;
			case "Sexo":
				this.sexo = unCampo.getValor();
				break;
			case "imagen":
				this.urlImagen = "http://localhost:8080/ttps-spring/imagenes/"+ unCampo.getValor();
				break;
			}		
		}
		
		this.idDueno = unaMascota.getDuenio().getId();
		this.idVeterinario = unaMascota.getVeterinario().getId();
		this.raza = unaMascota.getRaza().getDescripcion();
	}
}
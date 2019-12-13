package ttps.spring.dto;

public class NuevaMascotaDto {
	private String nombre;
	private String imagen;
	private String raza;
	private String fechanacimiento;
	private String idVeterinario;
	private String idDueno;
	private String senasParticulares;
	private String color;
	private String sexo;
	
	public String getIdVeterinario() {
		return idVeterinario;
	}
	public void setIdVeterinario(String idVeterinario) {
		this.idVeterinario = idVeterinario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
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
	public String getIdDueno() {
		return idDueno;
	}
	public void setIdDueno(String idDueno) {
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
}

package ttps.spring.dto;

import ttps.spring.model.Raza;

public class RazaEspecieDto {
	
	private int idRaza;
	private String descripcionEspecie;
	private String descripcionRaza;
	
	public RazaEspecieDto(Raza unaRaza) {
		
		this.setIdRaza(unaRaza.getId());
		this.setDescripcionRaza(unaRaza.getDescripcion());
		this.setDescripcionEspecie(unaRaza.getEspecie().getDescripcion());
		
	}
	
	public int getIdRaza() {
		return idRaza;
	}
	public void setIdRaza(int idRaza) {
		this.idRaza = idRaza;
	}
	public String getDescripcionEspecie() {
		return descripcionEspecie;
	}
	public void setDescripcionEspecie(String descripcionEspecie) {
		this.descripcionEspecie = descripcionEspecie;
	}
	public String getDescripcionRaza() {
		return descripcionRaza;
	}
	public void setDescripcionRaza(String descripcionRaza) {
		this.descripcionRaza = descripcionRaza;
	}
	
	

}

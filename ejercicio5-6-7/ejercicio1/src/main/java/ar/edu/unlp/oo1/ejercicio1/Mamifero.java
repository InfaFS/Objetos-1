package ar.edu.unlp.oo1.ejercicio1;


import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre=null;
	private Mamifero madre=null;
	
	public Mamifero(String id) {
		this.identificador = id;
	}
	
	public Mamifero() {
		
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String id) {
		this.identificador= id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getAbueloMaterno() {
		if(this.madre == null){return null;}
		return this.getMadre().getPadre();
	}
	public Mamifero getAbueloPaterno() {
		if(this.padre == null){return null;}
		return this.getPadre().getPadre();
	}
	public Mamifero getAbuelaMaterna() {
		if(this.madre == null){return null;}
		return this.getMadre().getMadre();
	}
	public Mamifero getAbuelaPaterna() {
		if(this.padre == null){return null;}
		return this.getPadre().getMadre();
	}
	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean ok = false;
		if (this != unMamifero) {
			ok = tieneComoAncestroARec(unMamifero);}
		return ok;
	}
	
	private Boolean tieneComoAncestroARec(Mamifero unMamifero) {
		boolean ok = false;
		if (this.equals(unMamifero)) {
			ok=true;
		}else {
			if (ok == false && this.getMadre() != null) {
			ok = this.getMadre().tieneComoAncestroARec(unMamifero);
			}
			if (ok == false && this.getPadre()!=null) {
				ok = this.getPadre().tieneComoAncestroARec(unMamifero);
				}
			}
		return ok;
	}
	
}
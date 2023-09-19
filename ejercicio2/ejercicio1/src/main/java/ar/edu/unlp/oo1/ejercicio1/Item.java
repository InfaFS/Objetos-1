package ar.edu.unlp.oo1.ejercicio1;


public class Item {
	private String detalle;
	private Integer cantidad;
	private Double 	costoUnitario;
	
	public Item(String detalle,  Double costoUnitario, Integer cantidad) {
		super();
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}

	public Double getCostoUnitario() {
		return this.costoUnitario;
	}
	

	public Double costo() {
		return this.costoUnitario*this.cantidad;
	}
}
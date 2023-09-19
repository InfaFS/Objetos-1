package ar.edu.unlp.oo1.ejercicio1;


import java.time.LocalDate;
import java.util.*;

public class Presupuesto extends Object{
	private LocalDate fecha;
	private String cliente;
	private ArrayList <Item> items=new ArrayList<Item>();
	
    public Presupuesto (){
        this.fecha=LocalDate.now();
        this.cliente=" ";
        

    }

	public LocalDate getFecha() {
		return LocalDate.now();
	}

	public String getCliente() {
		return cliente;
	}


	public Presupuesto(String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
	}

	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public Double calcularTotal() {
		Double x= 0.0;
		for (int i=0; i<this.items.size(); i++) {
			x+= this.items.get(i).costo();
		}
		return x;
	}
}

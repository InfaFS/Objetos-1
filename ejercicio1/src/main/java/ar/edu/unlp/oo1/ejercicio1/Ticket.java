package ar.edu.unlp.oo1.ejercicio1;

import java.sql.Date;
import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha=LocalDate.now();
    private int CantidadDeProductos;
    private Double pesoTotal;
    private Double precioTotal;

    public Ticket(){

    }

    public void setFecha(LocalDate fecha){
        this.fecha=fecha;
    }
    
    public LocalDate getFecha(){
        return this.fecha;
    }

    public void setCantidadProductos(int cant){
        this.CantidadDeProductos=cant;
    }

    public int getCantidadDeProductos(){
       return this.CantidadDeProductos;
    }

    public void setPesoTotal(Double peso){
        this.pesoTotal=peso;
    }

    public double getPesoTotal(){
        return this.pesoTotal;
    }

    public void setPrecioTotal(Double precio){
        this.precioTotal=precio;
    }

       public double getPrecioTotal(){
        return this.precioTotal;
    }

    public Double impuesto(){
        return this.precioTotal*0.21;
    }
    
}

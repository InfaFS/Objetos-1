package ar.edu.unlp.oo1.ejercicio1;

public class Producto {
    private String descripcion;
    
    private double peso;

    private double precioxKG;

    public Producto (){

    }

    public void setDescripcion(String descrip){
        this.descripcion=descrip;
    }

    public String getDescripcion(){
        return this.descripcion;
    }


    public void setPeso(double pesito){
        this.peso=pesito;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPrecioPorKilo(double precio){
        this.precioxKG=precio;
    }

    public double getPrecioPorKilo(){
        return this.precioxKG;
    }

    public double getPrecio(){
        return this.precioxKG*this.peso;
    }

}

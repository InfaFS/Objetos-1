package ar.edu.unlp.oo1.ejercicio1;

import java.time.LocalDate;

public class Factura {

    private Double montoEnergiaActiva;
    private Double descuento;
    private LocalDate fecha;
    private Usuario usuario;

    public Factura(Double montoEnergiaActiva, Double descuento, Usuario usuario){
        this.fecha=LocalDate.now(); //patron que se repite siempre en las fechas
        this.descuento=descuento;
        this.usuario=usuario;
        this.montoEnergiaActiva=montoEnergiaActiva;
    }
    
    public Double getMontoEnergiaActiva(){
        return this.montoEnergiaActiva;
    }

    public Usuario getUsuario(){
        return this.usuario;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public Double getDescuento(){
        return this.descuento;
    }

    public double montoTotal() {
        return this.montoEnergiaActiva - this.montoEnergiaActiva * (this.getDescuento() / 100);
    }


    
}

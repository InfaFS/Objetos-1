package ar.edu.unlp.oo1.ejercicio1;
import java.time.*;

public class Consumo {
    private LocalDate fecha;
    private Double consumoEnergiaActiva;
    private Double consumoEnergiaReactiva;

    public Consumo(LocalDate date,Double consumoEnergiaActiva,Double consumoEnergiaReactiva){
        this.fecha=LocalDate.now();
        this.consumoEnergiaActiva=consumoEnergiaActiva;
        this.consumoEnergiaReactiva=consumoEnergiaReactiva;

    }

    public Double costoEnBaseA(Double precioKwh){
        Double value=this.consumoEnergiaActiva*precioKwh;
        if (this.factorDePotencia()>0.8){
           Double descuento = (10*value)/100;
           return value-descuento;
        }
        else   
            return value;
    }

    public Double factorDePotencia(){
        return this.consumoEnergiaActiva/(Math.sqrt(Math.pow(this.consumoEnergiaActiva,2))+Math.pow(this.consumoEnergiaActiva,2));}
    
    public Double getconsumoEnergiaActiva(){
        return this.consumoEnergiaActiva;

    }

    public Double getconsumoEnergiaReactiva(){
        return this.consumoEnergiaReactiva;

    }

    public LocalDate getFecha(){

        return this.fecha;
    }
}

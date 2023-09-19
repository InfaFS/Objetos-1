package ar.edu.unlp.oo1.ejercicio1;

import java.util.ArrayList;

public class Usuario {
    private String domicilio;
    private String nombre;
    private ArrayList<Consumo> consumos;
    private Factura factura;


    public Usuario(String nombre, String domicilio){
        this.consumos=new ArrayList<Consumo>();
        this.domicilio=domicilio;
        this.nombre=nombre;
    }

    public String getDomicilio(){
        return this.domicilio;
    }

    public String getNombre(){
        return this.nombre;
    }


    public void agregarMedicion(Consumo Medicion){
        consumos.add(Medicion);
    }
    
    

    public Double ultimoConsumoActiva(){
       return consumos.get(consumos.size()-1).getConsumoEngergiaActiva();
    }
    
    //public Factura facturarEnBaseA(Double precioKWh){
      // return

    //}

    public ArrayList<Factura> facturas(){

    }
}

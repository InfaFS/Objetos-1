package ar.edu.unlp.oo1.ejercicio1;

import java.lang.reflect.Array;
import java.util.*;

public class Distribuidora {
    private Double precioKWh;
    private ArrayList<Usuario> usuarios;

    public Distribuidora(Double valor){
        usuarios=new ArrayList<>();
        this.precioKWh=valor;
    }

    public void agregarUsuario(Usuario user){
        this.usuarios.add(user);
    }

    public void setprecioKW(Double value){
        this.precioKWh=value;
    }

    public Double getPrecioKW(){
        return this.precioKWh;
    }

    public ArrayList<Factura> facturar(){
        ArrayList<Factura> facturasList= new ArrayList<Factura>();
        for (int i=0; i<usuarios.size(); i++) {
          facturasList.add( this.usuarios.get(i).facturas.facturas()); }

        return facturasList;


    }

    public ArrayList<Usuario> getUsuarios(){
        return this.usuarios;
    }

    public Double consumoTotalActiva(){
        double var=0.0;
           for (int i=0; i<usuarios.size(); i++) {
          var+=this.usuarios.get(i).ultimoConsumoActiva(); }
          return var;
    }


}

package ar.edu.unlp.oo1.ejercicio1;

public class Balanza {
    private int cantidadProductos;
    private Double precioTotal;
    private Double pesoTotal;

    public Balanza(){
        this.cantidadProductos=0;
        this.precioTotal=0.0;
        this.pesoTotal=0.0;
    }

    public void agregarProducto(Producto producto ){
        this.cantidadProductos++;
        this.pesoTotal+=producto.getPeso();
        this.precioTotal+=producto.getPrecio();
    }

    public int getCantidadDeProductos(){
        return this.cantidadProductos;
    
    }

    public Double getPrecioTotal(){
        return this.precioTotal;

    }

    public Double getPesoTotal(){
        return this.pesoTotal;
    }

    public void ponerEnCero(){
        this.cantidadProductos=0;
        this.precioTotal=0.0;
        this.pesoTotal=0.0;
    }

    public Ticket emitirTicket(){
        Ticket tk = new Ticket();
        tk.setPesoTotal(pesoTotal);
        tk.setPrecioTotal(precioTotal);
        tk.setCantidadProductos(cantidadProductos);
        return tk;
    }
}

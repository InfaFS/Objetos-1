package ar.edu.unlp.oo1.ejercicio1;
public class Cuadrado implements Figura {
    
    private Double lado;

    public void setLado(Double valor){
        this.lado=valor;
    }

    public Double getLado(){
        return this.lado;
    }

    public Double getPerimetro(){
        return this.lado*4;

    }

    public Double getArea(){
        return this.lado*this.lado;
    }
}

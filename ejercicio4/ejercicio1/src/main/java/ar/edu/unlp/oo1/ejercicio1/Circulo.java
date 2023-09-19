package ar.edu.unlp.oo1.ejercicio1;

public class Circulo implements Figura{
    private Double diametro;
    private Double radio;
    public void setDiametro(Double valor){
        this.diametro=valor;

    }
    
    public Double getDiametro(){
        return this.diametro;
    }

    public Double getRadio(){
        return this.diametro/2;
    }

    public void setRadio(Double radio){
        this.radio=radio;
        this.diametro=radio*2;
    }

    public Double getPerimetro(){
        return this.diametro/2*(2*Math.PI);
    }

    public Double getArea(){
        return (this.diametro/2)*(this.diametro/2)*Math.PI;
    }

}

package ar.edu.unlp.oo1.ejercicio1;

import java.util.*;

public class Cuerpo3D {
   private Double altura;
   private Figura CaraBasal;
   

    public void setAltura(Double valor){
        this.altura=valor;
    }

    public Double getAltura(){
        return this.altura;
    }

    public void setCaraBasal(Figura figura){
        this.CaraBasal=figura;
    }

    public Double getVolumen(){
        if (this.CaraBasal instanceof Circulo){
            Circulo circulo = (Circulo) this.CaraBasal;
           return circulo.getRadio()*circulo.getRadio()*altura*Math.PI;

        }
        else{
            Cuadrado cuadrado = (Cuadrado) this.CaraBasal;
            return cuadrado.getArea()*altura;
        }
    }

    public Double getSuperficieExterior(){
        if (this.CaraBasal instanceof Circulo){
            Circulo circulo = (Circulo) this.CaraBasal;
            return ((2*Math.PI*this.altura*circulo.getRadio())+(2*Math.PI*circulo.getRadio()*circulo.getRadio()));
        }
        else{
            Cuadrado cuadrado = (Cuadrado) this.CaraBasal;
            return (cuadrado.getPerimetro()*this.altura)+ (2*cuadrado.getArea());
        }



    }

}

package ar.edu.unlp.oo1.ejercicio1;

import java.util.ArrayList;

public class Farola {
    private boolean estado=false;
    private ArrayList<Farola> farolas;

    public Farola() {
        farolas = new ArrayList<Farola>();
    }

    public Boolean isOn() {
        return estado;
    }

    public ArrayList<Farola> getNeighbors(){
        return farolas;
    }

    public void pairWithNeighbor(Farola farola) {
        if (!this.getNeighbors().contains(farola)) {
            farola.getNeighbors().add(this);
            this.farolas.add(farola);
        }
    }

    public void turnOn() {
        if(!this.isOn()) {
            this.estado = true;
            for (int i=0; i<farolas.size(); i++) {
                this.farolas.get(i).turnOn();
            }
        }
    }
    public void turnOff() {
        if(this.isOn()) {
            this.estado = false;
            for (int i=0; i<farolas.size(); i++) {
                this.farolas.get(i).turnOff();
            }
        }
    }

}
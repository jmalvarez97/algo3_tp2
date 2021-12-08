package edu.fiuba.algo3.modelo;

public class Sargento implements StatePolicia {
    private int velocidad;
    private Policia policia;


    public Sargento(){
        this.velocidad = 1500;
    }

    public int velocidad(){
        return this.velocidad;
    }

    public void confirmarCaso(int casosResueltos){
    }

    public void setPolicia(Policia policia){
        this.policia = policia;
    }


}

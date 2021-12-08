package edu.fiuba.algo3.modelo;

public class Novato implements StatePolicia {
    private int velocidad;
    private Policia policia;


    public Novato(){
        this.velocidad = 900;
    }

    public int velocidad(){
        return this.velocidad;
    }

    public void confirmarCaso(int casosResueltos){
        if(casosResueltos >= 5){
            this.policia.setState(new Detective());
        }

    }

    public void setPolicia(Policia policia){
        this.policia = policia;
    }


}

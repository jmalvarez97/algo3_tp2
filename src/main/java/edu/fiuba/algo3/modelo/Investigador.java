package edu.fiuba.algo3.modelo;

public class Investigador implements StatePolicia {
    private int velocidad;
    private Policia policia;


    public Investigador(){
        this.velocidad = 1300;
    }

    public int velocidad(){
        return this.velocidad;
    }

    public void confirmarCaso(int casosResueltos){
        if(casosResueltos >= 20){
            this.policia.setState(new Sargento());
        }

    }

    public void setPolicia(Policia policia){
        this.policia = policia;
    }


}

package edu.fiuba.algo3.modelo;

public class Investigador implements StatePolicia {
    private int velocidad;
    private Policia policia;
    private String valorObjetoBuscado;


    public Investigador(){
        this.velocidad = 1300;
        this.valorObjetoBuscado = "Valioso";
    }

    public int velocidad(){
        return this.velocidad;
    }
    public String valorObjetoBuscado(){
        return this.valorObjetoBuscado;
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

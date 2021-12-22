package edu.fiuba.algo3.modelo;

public class Detective implements StatePolicia {
    private int velocidad;
    private Policia policia;
    private String valorObjetoBuscado;


    public Detective() {
        this.velocidad = 1100;
        this.valorObjetoBuscado = "Valioso";
    }

    public int velocidad(){
        return this.velocidad;
    }
    public String valorObjetoBuscado(){
        return this.valorObjetoBuscado;
    }

    public void confirmarCaso(int casosResueltos){
        if(casosResueltos >= 10){
            this.policia.setState(new Investigador());
        }

    }

    public void setPolicia(Policia policia){
        this.policia = policia;
    }


}

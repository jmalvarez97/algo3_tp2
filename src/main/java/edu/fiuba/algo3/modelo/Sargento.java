package edu.fiuba.algo3.modelo;

public class Sargento implements StatePolicia {
    private int velocidad;
    private Policia policia;
    private String valorObjetoBuscado;


    public Sargento(){
        this.velocidad = 1500;
        this.valorObjetoBuscado = "Muy valioso";
    }

    public int velocidad(){
        return this.velocidad;
    }
    public String valorObjetoBuscado(){
        return this.valorObjetoBuscado;
    }

    public void confirmarCaso(int casosResueltos){
    }

    public int horasDeViaje(double distancia) {
        return distancia * this.velocidad;
    }

    public void setPolicia(Policia policia){
        this.policia = policia;
    }


}

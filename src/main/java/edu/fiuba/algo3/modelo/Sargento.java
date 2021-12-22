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

    public void setPolicia(Policia policia){
        this.policia = policia;
    }

    public int horasDeViaje(double distancia) {
        return (int) distancia * this.velocidad;
    }


}

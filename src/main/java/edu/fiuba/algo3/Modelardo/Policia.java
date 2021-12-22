package edu.fiuba.algo3.Modelardo;

import java.util.ArrayList;

public class Policia {
    private Reloj reloj;
    private StatePolicia state;
    private Computadora computadora;
    private int casosResueltos;
    private int horasPorHeridaCuchillo;


    public Policia(ArrayList<Ladron> listaLadrones){
        this.reloj = new Reloj();
        setState(new Novato());
        this.computadora = new Computadora(listaLadrones);
        this.casosResueltos = 0;
        this.horasPorHeridaCuchillo = 2;
    }

    public Tesoro devolverTesoroAcorde(ArrayList<Tesoro> listaTesoros){
        return (this.state).devolverTesoroAcorde(listaTesoros);
    }

    public void descontarHorasDeViaje(double distancia) { descontarHoras(state.horasDeViaje(distancia));}

    public int horasRestantes(){
        return this.reloj.horasRestantes();
    }

    public int hora(){
        return this.reloj.hora();
    }


    public void descontarHoras(int horas) {
        this.reloj.descontarHoras(horas);
    }

    public void herirConCuchillo(){
        this.reloj.descontarHoras(horasPorHeridaCuchillo);
        this.horasPorHeridaCuchillo = 1;
    }

    public int velocidad(){ return this.state.velocidad();}

    public void confirmarCaso(){
        this.casosResueltos++;
        this.state.confirmarCaso(casosResueltos);
}

    public void setState(StatePolicia state){
        this.state = state;
        this.state.setPolicia(this);
    }

}

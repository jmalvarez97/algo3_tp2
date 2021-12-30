package edu.fiuba.algo3.Modelardo.Policia;

import edu.fiuba.algo3.Modelardo.Computadora;
import edu.fiuba.algo3.Modelardo.Ladron;
import edu.fiuba.algo3.Modelardo.Pista;
import edu.fiuba.algo3.Modelardo.Tesoro;

import java.util.ArrayList;

public class Policia {
    private Reloj reloj;
    private StatePolicia state;
    private int casosResueltos;
    private int horasPorHeridaCuchillo;


    public Policia(){
        this.reloj = new Reloj();
        setState(new Novato());
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

    public Pista pistaValorCorrespondiente() {
        return (this.state).pistaValorCorrespondiente();
    }

}

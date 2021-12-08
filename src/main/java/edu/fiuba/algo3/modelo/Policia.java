package edu.fiuba.algo3.modelo;

public class Policia {
    private Reloj reloj;
    private StatePolicia state;
    private int casosResueltos;
    private int horasPorHeridaCuchillo;


    public Policia(){
        setState(new Novato());
        this.reloj = new Reloj();
        this.casosResueltos = 0;
        this.horasPorHeridaCuchillo = 2;
    }


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

package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Decorator.*;
import edu.fiuba.algo3.Modelardo.Policia.Policia;

import java.util.ArrayList;

public class Caso {

    private Policia policia;
    private Tesoro tesoro;
    private Ladron ladron;
    private Mapa mapa;
    private Computadora computadora;


    // Constructor con Mapa, lo generamos aleatorio?
    public Caso(Policia policia, Tesoro tesoro, Ladron ladron, Mapa unMapa, Computadora computadora){
        this.policia = policia;
        this.tesoro = tesoro;
        this.ladron = ladron;
        this.mapa = unMapa;
        this.computadora = computadora;
    }

    public String visitar(String unEdificio) {
        return mapa.visitar(unEdificio,policia,this.ladron);
    }

    public void viajar(Ciudad destino){
        double distanciaViaje = (this.mapa).viajar(destino, this.tesoro);
        (this.policia).descontarHorasDeViaje(distanciaViaje);
    }


    public void herirPoliciaConCuchillo(){
        this.policia.herirConCuchillo();
    }

    public Ciudad ciudadActual(){
        return this.mapa.ciudadActual();
    }

    public boolean chequearOrdenDeArresto(){
        return computadora.chequearOrdenDeArresto(this.ladron);
    }

    public boolean chequearCantidadDePaises(){return tesoro.cumplePaisesNecesarios();}

    public String nombreCompletoTesoro() {
        return (this.tesoro).nombreCompleto();
    }

    public ArrayList<Ciudad> opcionesParaViajar (){return (this.mapa).opcionesParaViajar();}

    public void emitirOrdenDeArresto(Ladron ladron){
        this.computadora.emitirOrdenDeArresto(ladron);
        this.policia.descontarHoras(3);
    }

    public double viajarCorrecto() {
        double distanciaViaje = this.mapa.viajarCorrecto(this.tesoro);
        this.policia.descontarHorasDeViaje(distanciaViaje);
        return distanciaViaje;
    }

    public void emitirOrdenCorrecta() {
        emitirOrdenDeArresto(this.ladron);
    }

    public boolean cumplePaisesNecesarios() {
        return this.tesoro.cumplePaisesNecesarios();
    }

    public void cargarPelo(String pelo){
        this.computadora.cargarPelo(pelo);
    }

    public void cargarHobby(String hobby){ this.computadora.cargarHobby(hobby); }

    public void cargarVehiculo(String coche){ this.computadora.cargarVehiculo(coche); }


    public void cargarSexo(String sexo){
        this.computadora.cargarSexo(sexo);
    }

    public void cargarSenia(String senia){
        this.computadora.cargarSenia(senia);
    }

    public ArrayList<Ladron> buscarSospechosos(){
        return this.computadora.buscarSospechosos();
    }

    public boolean tieneTiempo(){
        if(this.policia.horasRestantes() <= 0){
            return false;
        }

        return true;
    }
}

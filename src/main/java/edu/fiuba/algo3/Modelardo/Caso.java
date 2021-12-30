package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Decorator.Ladron;
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
        return mapa.visitar(unEdificio,policia);
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
}

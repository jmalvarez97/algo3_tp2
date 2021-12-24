package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Policia.Policia;

import java.util.ArrayList;

public class Caso {

    private Policia policia;
    private Tesoro tesoro;
    private Ladron ladron;
    private Mapa mapa;


    // Constructor con Mapa, lo generamos aleatorio?
    public Caso(Policia policia, Tesoro tesoro, Ladron ladron, Mapa unMapa){
        this.policia = policia;
        this.tesoro = tesoro;
        this.ladron = ladron;
        this.mapa = unMapa;
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
        return policia.chequearOrdenDeArresto(this.ladron);
    }

    public boolean chequearCantidadDePaises(){return tesoro.cumplePaisesNecesarios();}

    public void mostrarPaises() {
        ArrayList<Ciudad> ciudades =  this.mapa.opcionesParaViajar();
        for (int i = 0; i < ciudades.size(); i++) {
            ciudades.get(i).mostrarse();
        }

    }

    public void mostrarEdificios() {
        this.mapa.mostrarEdificios();
    }

    public double viajarCorrecto() {
        return this.mapa.viajarCorrecto(this.tesoro);

    }
}

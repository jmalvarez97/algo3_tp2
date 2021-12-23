package edu.fiuba.algo3.Modelardo;

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
        double distanciaViaje = (this.mapa).viajar(destino);
        (this.policia).descontarHorasDeViaje(distanciaViaje);
    }

    public String generarObjetoRobado() {
        return "Tesoro Nacional";
    }

    public void herirPoliciaConCuchillo(){
        this.policia.herirConCuchillo();
    }

    public Ciudad ciudadActual(){
        return this.mapa.ciudadActual();
    }



}

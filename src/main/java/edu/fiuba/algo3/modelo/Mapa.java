package edu.fiuba.algo3.modelo;

public class Mapa {

    private Ciudad actual;
    private Ciudad proxima;


    public Mapa(Ciudad actual, Ciudad proxima){
        this.actual = actual;
        this.proxima = proxima;
    }

    public String visitar(String unEdificio, Policia policia){
        return actual.visitar(proxima, unEdificio, policia);
    }

    public Ciudad ciudadActual(){
        return this.actual;
    }


}

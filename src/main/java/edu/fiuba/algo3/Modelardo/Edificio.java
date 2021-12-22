package edu.fiuba.algo3.Modelardo;

public interface Edificio {
    //Ver la creacion de pistas (faciles, medias o dificiles)
    //Pista pista = new Pista();

    String darPista(Ciudad ciudadProxima);
    void descontarHorasDePolicia(Policia policia);
}

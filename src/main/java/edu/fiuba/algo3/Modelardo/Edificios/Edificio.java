package edu.fiuba.algo3.Modelardo.Edificios;

import edu.fiuba.algo3.Modelardo.Ciudad;
import edu.fiuba.algo3.Modelardo.Pistas.Pista;
import edu.fiuba.algo3.Modelardo.Policia.Policia;

public interface Edificio {
    //Ver la creacion de pistas (faciles, medias o dificiles)
    //Pista pista = new Pista();

    String darPista(Pista pistaValor, Ciudad ciudadProxima);
    void descontarHorasDePolicia(Policia policia);
}

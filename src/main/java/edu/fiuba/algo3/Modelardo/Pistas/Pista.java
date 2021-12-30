package edu.fiuba.algo3.Modelardo.Pistas;

import edu.fiuba.algo3.Modelardo.Ciudad;

public interface Pista {

    public String darPistaEconomica(Ciudad proxima);
    public String darPistaViaje(Ciudad proxima);
    public String darPistaCultura(Ciudad proxima);
}

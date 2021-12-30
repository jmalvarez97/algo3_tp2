package edu.fiuba.algo3.Modelardo.Pistas;

import edu.fiuba.algo3.Modelardo.Ciudad;
import edu.fiuba.algo3.Modelardo.Pistas.Pista;

public class PistaFacil implements Pista {
    @Override
    public String darPistaEconomica(Ciudad proxima) {
        return proxima.pistaMoneda();
    }

    @Override
    public String darPistaViaje(Ciudad proxima) {
        return proxima.pistaColores();
    }

    @Override
    public String darPistaCultura(Ciudad proxima) {
        return proxima.pistaArte();
    }

}


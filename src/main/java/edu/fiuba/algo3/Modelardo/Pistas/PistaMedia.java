package edu.fiuba.algo3.Modelardo.Pistas;

import edu.fiuba.algo3.Modelardo.Ciudad;
import edu.fiuba.algo3.Modelardo.Pistas.Pista;

public class PistaMedia implements Pista {
    @Override
    public String darPistaEconomica(Ciudad proxima) {
        return proxima.pistaIndustria();
    }

    @Override
    public String darPistaViaje(Ciudad proxima) {
        return proxima.pistaIdiomas();
    }

    @Override
    public String darPistaCultura(Ciudad proxima) {
        return proxima.pistaEtnias();
    }
}

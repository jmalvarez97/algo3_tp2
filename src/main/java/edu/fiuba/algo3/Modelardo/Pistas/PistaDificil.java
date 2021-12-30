package edu.fiuba.algo3.Modelardo.Pistas;

import edu.fiuba.algo3.Modelardo.Ciudad;
import edu.fiuba.algo3.Modelardo.Pistas.Pista;

public class PistaDificil implements Pista {
    @Override
    public String darPistaEconomica(Ciudad proxima) {
        return proxima.pistaRepresentante();
    }

    @Override
    public String darPistaViaje(Ciudad proxima) {
        return proxima.pistaGeografia();
    }

    @Override
    public String darPistaCultura(Ciudad proxima) {return proxima.pistaReligion();
    }

}

package edu.fiuba.algo3.Modelardo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

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


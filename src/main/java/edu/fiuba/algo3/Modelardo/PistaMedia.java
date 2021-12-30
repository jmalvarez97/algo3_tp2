package edu.fiuba.algo3.Modelardo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class PistaMedia implements Pista{
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

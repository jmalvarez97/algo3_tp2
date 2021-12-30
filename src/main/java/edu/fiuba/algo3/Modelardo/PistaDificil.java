package edu.fiuba.algo3.Modelardo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class PistaDificil implements Pista{
    @Override
    public String darPistaEconomica(Ciudad proxima) {
        return proxima.getRepresentante();
    }

    @Override
    public String darPistaViaje(Ciudad proxima) {
        return proxima.getGeografia();
    }

    @Override
    public String darPistaCultura(Ciudad proxima) { return proxima.getReligion(); }

}

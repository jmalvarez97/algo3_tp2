package edu.fiuba.algo3.Decorator;

import java.util.ArrayList;

public class Tenis extends Decorator{

    public Tenis(Ladron ladron) {
        super(ladron);
    }

    @Override
    public ArrayList<String> misCualidades() {
        ArrayList<String> lista = super.misCualidades();
        lista.add("Juega Tenis");
        return lista;
    }
}

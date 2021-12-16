package edu.fiuba.algo3.Decorator;

import java.util.ArrayList;

public class LadronBase implements Ladron{
    ArrayList<String> lista;

    @Override
    public ArrayList<String> misCualidades() {
        this.lista = new ArrayList<String>();
        return this.lista;
    }

}

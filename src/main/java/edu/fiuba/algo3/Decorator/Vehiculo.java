package edu.fiuba.algo3.Decorator;

import java.util.ArrayList;

public class Vehiculo extends Decorator{

    public Vehiculo(Ladron ladron, String cualidad) {
        super(ladron, cualidad);
    }

    public ArrayList<String> misCualidades() {
        ArrayList<String> lista = super.misCualidades();
        lista.add(cualidad);
        return lista;

    }
}

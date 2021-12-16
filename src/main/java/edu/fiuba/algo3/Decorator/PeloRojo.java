package edu.fiuba.algo3.Decorator;

import java.util.ArrayList;

public class PeloRojo extends Decorator{
    public PeloRojo(Ladron ladron) {
        super(ladron);
    }

    @Override
    public ArrayList<String> misCualidades() {
        ArrayList<String> lista = super.misCualidades();
        lista.add("Pelo Rojo");
        return lista;

    }


}

package edu.fiuba.algo3.Decorator;

import java.util.ArrayList;

public class PeloRubio extends Decorator{
    public PeloRubio(Ladron ladron) {
        super(ladron);
    }

    @Override
    public ArrayList<String> misCualidades() {
        ArrayList<String> lista = super.misCualidades();
        lista.add("Pelo Rubio");
        return lista;

    }


}

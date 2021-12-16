package edu.fiuba.algo3.Decorator;

import java.util.ArrayList;

public class Capa extends Decorator{
    public Capa(Ladron ladron, String cualidad) {
        super(ladron, cualidad);
    }

    public ArrayList<String> misCualidades() {
        ArrayList<String> lista = super.misCualidades();
        lista.add(this.cualidad);
        return lista;
    }

    public boolean contiene(Decorator otroLadron) {
        ArrayList<String> lista = this.misCualidades();
        return otroLadron.incluyeA(lista);

    }
}

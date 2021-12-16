package edu.fiuba.algo3.Decorator;

import java.util.ArrayList;

public abstract class Decorator implements Ladron{
    String cualidad;
    Ladron ladron;

    Decorator(Ladron ladron){
        this.ladron = ladron;
    }
    Decorator(Ladron ladron, String cualidad){
        this.ladron = ladron;
        this.cualidad = cualidad;
    }

    @Override
    public ArrayList<String> misCualidades() {
        return ladron.misCualidades();
    }

    public boolean coinciden(Decorator otroLadron) {
        ArrayList<String> lista = this.misCualidades();
        return otroLadron.incluyeA(lista);

    }

    protected boolean incluyeA(ArrayList<String> lista) {
        ArrayList<String> miLista = this.misCualidades();
        return miLista.containsAll(lista);

    }
}

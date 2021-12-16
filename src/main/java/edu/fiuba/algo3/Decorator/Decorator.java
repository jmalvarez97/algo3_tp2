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
}

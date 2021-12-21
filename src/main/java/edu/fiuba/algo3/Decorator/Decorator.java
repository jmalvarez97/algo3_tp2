package edu.fiuba.algo3.Decorator;

import java.util.ArrayList;

public abstract class Decorator implements Pregunta {
    String cualidad;
    Pregunta pregunta;

    Decorator(Pregunta pregunta, String cualidad){
        this.pregunta = pregunta;
        this.cualidad = cualidad;
    }

    @Override
    public boolean preguntar(String dato) {
        return this.preguntar(dato);
    }
}

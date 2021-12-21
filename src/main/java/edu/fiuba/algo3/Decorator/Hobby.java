package edu.fiuba.algo3.Decorator;

import java.util.Objects;

public class Hobby extends Decorator{
    public Hobby(Pregunta pregunta, String cualidad) {
        super(pregunta, cualidad);
    }

    @Override
    public boolean preguntar(String dato) {
        if (Objects.equals(this.cualidad, dato))
            return true;
        return this.pregunta.preguntar(dato);
    }
}


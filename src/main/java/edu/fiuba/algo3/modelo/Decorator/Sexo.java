package edu.fiuba.algo3.modelo.Decorator;

import java.util.Objects;

public class Sexo extends Decorator{
    public Sexo(Pregunta pregunta, String cualidad) {
        super(pregunta, cualidad);
    }

    @Override
    public boolean preguntar(String dato) {
        if (Objects.equals(this.cualidad, dato))
            return true;
        return this.pregunta.preguntar(dato);
    }
}


package edu.fiuba.algo3.Modelardo.Decorator;

import java.util.Objects;

public class ColorDePelo extends Decorator{


    public ColorDePelo(Pregunta pregunta, String cualidad) {
        super(pregunta, cualidad);
    }

    @Override
    public boolean preguntar(String dato) {
        if (Objects.equals(this.cualidad, dato))
            return true;
        return this.pregunta.preguntar(dato);
    }
}

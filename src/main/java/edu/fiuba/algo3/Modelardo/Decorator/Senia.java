package edu.fiuba.algo3.Modelardo.Decorator;

import edu.fiuba.algo3.Modelardo.Ladron;

public class Senia extends Decorator{


    public Senia(Pregunta unaPregunta, String cualidad) {
        super(unaPregunta, cualidad);
    }

    @Override
    public boolean comparar(Ladron otroLadron) {
        return super.comparar(otroLadron) && otroLadron.tieneSenia(this.cualidad);
    }
}

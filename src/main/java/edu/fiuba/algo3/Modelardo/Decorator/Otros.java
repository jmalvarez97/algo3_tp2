package edu.fiuba.algo3.Modelardo.Decorator;

public class Otros extends Decorator{


    public Otros(Pregunta unaPregunta, String cualidad) {
        super(unaPregunta, cualidad);
    }

    @Override
    public boolean comparar(Ladron otroLadron) {
        return super.comparar(otroLadron) && otroLadron.tieneOtros(this.cualidad);
    }
}

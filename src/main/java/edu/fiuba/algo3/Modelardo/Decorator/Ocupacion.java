package edu.fiuba.algo3.Modelardo.Decorator;

public class Ocupacion extends Decorator{


    public Ocupacion(Pregunta unaPregunta, String cualidad) {
        super(unaPregunta, cualidad);
    }

    @Override
    public boolean comparar(Ladron otroLadron) {
        return super.comparar(otroLadron) && otroLadron.tieneOcupacion(this.cualidad);
    }
}

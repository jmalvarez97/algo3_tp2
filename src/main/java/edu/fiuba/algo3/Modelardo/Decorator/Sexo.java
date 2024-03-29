package edu.fiuba.algo3.Modelardo.Decorator;

public class Sexo extends Decorator{


    public Sexo(Pregunta unaPregunta, String cualidad) {
        super(unaPregunta, cualidad);
    }

    @Override
    public boolean comparar(Ladron otroLadron) {
        return super.comparar(otroLadron) && otroLadron.tieneSexo(this.cualidad);
    }

}

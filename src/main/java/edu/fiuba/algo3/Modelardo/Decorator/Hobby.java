package edu.fiuba.algo3.Modelardo.Decorator;

public class Hobby extends Decorator{


    public Hobby(Pregunta unaPregunta, String cualidad) {
        super(unaPregunta, cualidad);
    }

    @Override
    public boolean comparar(Ladron otroLadron) {
        return super.comparar(otroLadron) && otroLadron.tieneHobby(this.cualidad);
    }


}

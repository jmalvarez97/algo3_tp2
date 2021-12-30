package edu.fiuba.algo3.Modelardo.Decorator;

public class ColorDePelo extends Decorator{


    public ColorDePelo(Pregunta unaPregunta, String cualidad) {
        super(unaPregunta, cualidad);
    }

    @Override
    public boolean comparar(Ladron otroLadron) {
        return super.comparar(otroLadron) && otroLadron.tienePeloDeColor(this.cualidad);


    }
}

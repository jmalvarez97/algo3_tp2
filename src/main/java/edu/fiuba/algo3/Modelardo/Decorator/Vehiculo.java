package edu.fiuba.algo3.Modelardo.Decorator;

import edu.fiuba.algo3.Modelardo.Ladron;

public class Vehiculo extends Decorator{


    public Vehiculo(Pregunta unaPregunta, String cualidad) {
        super(unaPregunta, cualidad);
    }

    @Override
    public boolean comparar(Ladron otroLadron) {
        return super.comparar(otroLadron) && otroLadron.tieneVehiculo(this.cualidad);
    }
}

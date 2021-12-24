package edu.fiuba.algo3.Modelardo;

import org.json.simple.JSONObject;

public class TesoroComun extends Tesoro{


    public TesoroComun(JSONObject tesoro) {
        super(tesoro);
    }

    @Override
    public boolean cumplePaisesNecesarios() {
        return this.paisesVisitados == 4;
    }
}

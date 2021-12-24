package edu.fiuba.algo3.Modelardo;

import org.json.simple.JSONObject;

public class TesoroValioso extends Tesoro{


    public TesoroValioso(JSONObject tesoro) {
        super(tesoro);
    }

    @Override
    public boolean cumplePaisesNecesarios() {
        return this.paisesVisitados == 5;
    }
}

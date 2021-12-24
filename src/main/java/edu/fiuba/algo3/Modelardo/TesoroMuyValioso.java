package edu.fiuba.algo3.Modelardo;

import org.json.simple.JSONObject;

public class TesoroMuyValioso extends Tesoro{


    public TesoroMuyValioso(JSONObject tesoro) {
        super(tesoro);
    }

    @Override
    public boolean cumplePaisesNecesarios() {
        return this.paisesVisitados == 7;
    }
}
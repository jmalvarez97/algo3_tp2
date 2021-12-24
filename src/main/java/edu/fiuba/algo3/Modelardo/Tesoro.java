package edu.fiuba.algo3.Modelardo;

import org.json.simple.JSONObject;

import java.util.Objects;

public abstract class Tesoro {

    protected final String ciudad;
    protected final String objeto;
    protected final String valor;
    protected int paisesVisitados;

    public Tesoro(JSONObject tesoro){

        //Leemos la ciudad
        this.ciudad = (String) tesoro.get("ciudad");

        //Leemos el sexo
        this.objeto = (String) tesoro.get("tesoro");

        //Leemos la ocupacion
        this.valor = (String) tesoro.get("valor");
    }

    public boolean esValor(String valor){
        if(Objects.equals(this.valor, valor)){
            return true;
        }
        return false;
    }

    public void sumarPaisCorrecto() {
        paisesVisitados++;
    }

    public abstract boolean cumplePaisesNecesarios();

}

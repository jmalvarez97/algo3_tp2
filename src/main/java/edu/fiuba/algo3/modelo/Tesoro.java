package edu.fiuba.algo3.modelo;

import org.json.simple.JSONObject;

import java.util.Objects;

public class Tesoro {

    private final String ciudad;
    private final String objeto;
    private final String valor;

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
}

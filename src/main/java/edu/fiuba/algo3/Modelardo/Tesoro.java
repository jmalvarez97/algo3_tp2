package edu.fiuba.algo3.Modelardo;

import org.json.simple.JSONObject;

import java.util.Objects;

public class Tesoro {

    protected final String ciudad;
    protected final String objeto;
    protected final String valor;
    protected int viajesPorHacer;

    public Tesoro(JSONObject tesoro){

        //Leemos la ciudad
        this.ciudad = (String) tesoro.get("ciudad");

        //Leemos el sexo
        this.objeto = (String) tesoro.get("tesoro");

        //Leemos el valor
        this.valor = (String) tesoro.get("valor");

        if(Objects.equals(this.valor, "Comun")) {
            this.viajesPorHacer = 3;

        } else if (Objects.equals(this.valor, "Valioso")) {
            this.viajesPorHacer = 4;
        } else {
            this.viajesPorHacer = 6;
        }
    }

    public Tesoro(String ciudad, String objeto, String valor) {
        this.ciudad = ciudad;
        this.objeto = objeto;
        this.valor = valor;

        if(Objects.equals(this.valor, "Comun")) {
            this.viajesPorHacer = 4;

        } else if (Objects.equals(this.valor, "Valioso")) {
            this.viajesPorHacer = 5;
        } else {
            this.viajesPorHacer = 7;
        }
    }

    public boolean esValor(String valor){
        if(Objects.equals(this.valor, valor)){
            return true;
        }
        return false;
    }

    public void sumarPaisCorrecto() {
        this.viajesPorHacer--;
    }

    public boolean cumplePaisesNecesarios() {return this.viajesPorHacer <= 0;};

    public String nombreCompleto() {
        return (this.objeto + " de " + this.ciudad);
    }

}

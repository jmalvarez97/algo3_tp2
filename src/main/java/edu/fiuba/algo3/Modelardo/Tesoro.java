package edu.fiuba.algo3.Modelardo;

import org.json.simple.JSONObject;

import java.util.Objects;

public class Tesoro {

    protected final String ciudad;
    protected final String objeto;
    protected final String valor;
    protected int paisesCorrectosPorVisitar;

    public Tesoro(JSONObject tesoro){

        //Leemos la ciudad
        this.ciudad = (String) tesoro.get("ciudad");

        //Leemos el sexo
        this.objeto = (String) tesoro.get("tesoro");

        //Leemos la ocupacion
        this.valor = (String) tesoro.get("valor");

        if(this.valor == "Comun") {
            this.paisesCorrectosPorVisitar = 4;

        } else if (this.valor == "Valioso") {
            this.paisesCorrectosPorVisitar = 5;
        } else {
            this.paisesCorrectosPorVisitar = 7;
        }
    }

    public Tesoro(String ciudad, String objeto, String valor) {
        this.ciudad = ciudad;
        this.objeto = objeto;
        this.valor = valor;

        if(this.valor == "Comun") {
            this.paisesCorrectosPorVisitar = 4;

        } else if (this.valor == "Valioso") {
            this.paisesCorrectosPorVisitar = 5;
        } else {
            this.paisesCorrectosPorVisitar = 7;
        }
    }

    public boolean esValor(String valor){
        if(Objects.equals(this.valor, valor)){
            return true;
        }
        return false;
    }

    public void sumarPaisCorrecto() {
        this.paisesCorrectosPorVisitar--;
    }

    public boolean cumplePaisesNecesarios() {return this.paisesCorrectosPorVisitar <= 0;};

    public String nombreCompleto() {
        return (this.objeto + " de " + this.ciudad);
    }

}

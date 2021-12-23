package edu.fiuba.algo3.Modelardo;


import edu.fiuba.algo3.Modelardo.Decorator.Pregunta;
import org.json.simple.JSONObject;

import java.util.Objects;

public class Ladron implements Pregunta {
    private String nombre;
    private String sexo;
    private String ocupacion;
    private String hobby;
    private String colorDelPelo;
    private String senia;
    private String coche;
    private String otros;

    public Ladron(String colorDelPelo, String hobby, String coche, String sexo, String senia){
        this.colorDelPelo = colorDelPelo;
        this.hobby = hobby;
        this.coche = coche;
        this.sexo = sexo;
        this.senia = senia;
    }


    public Ladron(JSONObject dossier){

        //Leemos el nombre de la Ladron
        this.nombre = (String) dossier.get("nombre");

        //Leemos el sexo
        this.sexo = (String) dossier.get("sexo");

        //Leemos la ocupacion
        this.ocupacion = (String) dossier.get("ocupacion");

        //Leemos el hobby
        this.hobby = (String) dossier.get("hobby");

        //Leemos el colorDelPelo
        this.colorDelPelo = (String) dossier.get("colorDelPelo");

        //Leemos el coche
        this.coche = (String) dossier.get("coche");

        //Leemos las señas particulares
        this.senia = (String) dossier.get("señasParticulares");

        //Leemos "otros"
        this.otros = (String) dossier.get("otros");
    }

    public Ladron() {

    }


    public boolean tienePeloDeColor(String cualidad) {
        return Objects.equals(this.colorDelPelo, cualidad);
    }

    public boolean tieneHobby(String cualidad) {
        return Objects.equals(this.hobby, cualidad);
    }

    public boolean tieneVehiculo(String cualidad) {
        return Objects.equals(this.coche,cualidad);
    }

    public boolean tieneSexo(String cualidad){
        return Objects.equals(this.sexo, cualidad);
    }

    public boolean tieneSenia(String cualidad){
        return Objects.equals(this.senia, cualidad);
    }

    @Override
    public boolean comparar(Ladron otroLadron) {
        return true;
    }
}




package edu.fiuba.algo3.Modelardo;


import org.json.simple.JSONObject;

public class Ladron {
    private String nombre;
    private String sexo;
    private String ocupacion;
    private String hobby;
    private String colorDelPelo;
    private String senia;
    private String coche;
    private String otros;


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



    public String getHobby(){
        return this.hobby;
    }

}




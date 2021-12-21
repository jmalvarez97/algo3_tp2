package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Ladron;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LecturaLadrones {

    public void leerLadrones() {
        //leemos un json con los ladrones y los cargamos en una lista
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("dossiers.json")) {
            //Leemos el archivo JSON
            Object obj = parser.parse(reader);

            JSONArray listaLadronesJson = (JSONArray) obj;
            ArrayList<Ladron> listaLadrones = new ArrayList<Ladron>();

            //Itero la lista de Ladrones
            for(int i=0; i > listaLadronesJson.size(); i++) {
                listaLadrones.add( parseLadronObject((JSONObject) listaLadronesJson.get(i)) );
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }





    private static Ladron parseLadronObject(JSONObject dossier)
    {
        //Leemos el nombre de la Ladron
        String nombre = (String) dossier.get("nombre");

        //Leemos el sexo
        String sexo = (String) dossier.get("sexo");

        //Leemos la ocupacion
        String ocupacion = (String) dossier.get("ocupacion");

        //Leemos el hobby
        String hobby = (String) dossier.get("hobby");

        //Leemos el colorDelPelo
        String colorDelPelo = (String) dossier.get("colorDelPelo");

        //Leemos el coche
        String coche = (String) dossier.get("coche");

        //Leemos las señas particulares
        String senias = (String) dossier.get("señasParticulares");

        //Leemos "otros"
        String otros = (String) dossier.get("otros");


        //Esto no puede ser asi
        Ladron newLadron = new Ladron(nombre, sexo, ocupacion, hobby, colorDelPelo, coche, senias, otros);
        return newLadron;
    }
}

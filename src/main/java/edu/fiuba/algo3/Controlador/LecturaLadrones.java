package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.Ladron;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LecturaLadrones {

    public static ArrayList<Ladron> leerLadrones() {
        //leemos un json con los ladrones y los cargamos en una lista
        JSONParser parser = new JSONParser();
        ArrayList<Ladron> listaLadrones = new ArrayList<Ladron>();

        try (FileReader reader = new FileReader("dossiers.json")) {
            //Leemos el archivo JSON
            Object obj = parser.parse(reader);

            JSONArray listaLadronesJson = (JSONArray) obj;


            //Itero la lista de Ladrones
            for(int i=0; i > listaLadronesJson.size(); i++) {
                listaLadrones.add( new Ladron( (JSONObject) listaLadronesJson.get(i)) );
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return listaLadrones;
    }
}

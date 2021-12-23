package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.Ciudad;
import edu.fiuba.algo3.Modelardo.Ladron;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LecturaCiudades {

    public static ArrayList<Ciudad> leerCiudades() {
        //leemos un json para definir si vamos a crear un banco o bolsa/puerto o aeropuerto
        JSONParser parser = new JSONParser();
        ArrayList<Ciudad> listaCiudades = new ArrayList<Ciudad>();

        try (FileReader reader = new FileReader("src/main/java/edu/fiuba/algo3/Controlador/ciudadesSinTerminar.json")) {
            //Leemos el archivo JSON
            JSONObject obj = (JSONObject) parser.parse(reader);
            JSONArray listaCiudadesJson  = (JSONArray) obj.get("ciudades");

            //Itero la lista de ciudades
            for(int i=0; i < listaCiudadesJson.size(); i++) {
                listaCiudades.add(new Ciudad( (JSONObject) listaCiudadesJson.get(i)) );
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return listaCiudades;
    }



}

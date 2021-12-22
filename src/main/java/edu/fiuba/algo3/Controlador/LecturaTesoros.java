package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Tesoro;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LecturaTesoros {

    public static ArrayList<Tesoro> leerTesoros() {
        //leemos un json para definir si vamos a crear un banco o bolsa/puerto o aeropuerto
        JSONParser parser = new JSONParser();
        ArrayList<Tesoro> listaTesoros = new ArrayList<Tesoro>();

        try (FileReader reader = new FileReader("tesoros.json")) {
            //Leemos el archivo JSON
            Object obj = parser.parse(reader);

            JSONArray listaTesorosJson = (JSONArray) obj;


            //Itero la lista de Tesoroes
            for(int i=0; i > listaTesorosJson.size(); i++) {
                listaTesoros.add(new Tesoro( (JSONObject) listaTesorosJson.get(i)) );
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return listaTesoros;
    }
}

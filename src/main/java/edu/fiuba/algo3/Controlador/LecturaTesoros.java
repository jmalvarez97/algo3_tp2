package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.Ciudad;
import edu.fiuba.algo3.Modelardo.Tesoro;
import edu.fiuba.algo3.Modelardo.TesoroComun;
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

        try (FileReader reader = new FileReader("src/main/java/edu/fiuba/algo3/Controlador/tesoros.json")) {
            //Leemos el archivo JSON
            JSONObject obj = (JSONObject) parser.parse(reader);
            JSONArray listaTesorosJson  = (JSONArray) obj.get("tesoros");

            //Itero la lista de ciudades
            for(int i=0; i < listaTesorosJson.size(); i++) {

                listaTesoros.add(new TesoroComun( (JSONObject) listaTesorosJson.get(i)) );
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

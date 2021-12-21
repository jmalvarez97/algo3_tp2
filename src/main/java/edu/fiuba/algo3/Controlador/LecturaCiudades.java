package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Ciudad;
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

        try (FileReader reader = new FileReader("ciudadesSinTerminar.json")) {
            //Leemos el archivo JSON
            Object obj = parser.parse(reader);

            JSONArray listaCiudadesJson = (JSONArray) obj;


            //Itero la lista de ciudades
            for(int i=0; i > listaCiudadesJson.size(); i++) {
                listaCiudades.add( parseCiudadObject((JSONObject) listaCiudadesJson.get(i)) );
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
    private static Ciudad parseCiudadObject(JSONObject ciudad)
    {
        //Leemos el nombre de la ciudad
        String nombre = (String) ciudad.get("ciudad");

        //Leemos la moneda
        String moneda = (String) ciudad.get("moneda");

        //Leemos la geografia
        String geografia = (String) ciudad.get("geografia");

        //Leemos el arte
        String arte = (String) ciudad.get("arte");

        //Leemos la religion
        String religion = (String) ciudad.get("religion");

        //Leemos el representante
        String representante = (String) ciudad.get("representante");

        //Leemos el latitud
        double latitud = (double) ciudad.get("latitud");

        //Leemos el longitud
        double longitud = (double) ciudad.get("longitud");

        //Leemos la descripcion
        String descripcion = (String) ciudad.get("descripcion");




        //Tenemos que agregar múltiples colores de bandera
        JSONObject coloresBanderaObject = (JSONObject) ciudad.get("colorBandera");
        ArrayList<String> colorBandera = new ArrayList<>();
        for(int i = 0; i < coloresBanderaObject.size() ; i++){
            colorBandera.add( (String) coloresBanderaObject.get(i) );
        }

        //Tenemos que agregar múltiples idiomas
        JSONObject idiomasObject = (JSONObject) ciudad.get("idiomas");
        ArrayList<String> idiomas = new ArrayList<>();
        for(int i = 0; i < idiomasObject.size() ; i++){
            idiomas.add( (String) idiomasObject.get(i) );
        }


        //Tenemos que agregar múltiples caracteristicas
        JSONObject caracteristicasObject = (JSONObject) ciudad.get("caracteristicas");
        ArrayList<String> caracteristicas = new ArrayList<>();
        for(int i = 0; i < caracteristicasObject.size() ; i++){
            caracteristicas.add( (String) caracteristicasObject.get(i) );
        }

        //Tenemos que agregar múltiples industrias
        JSONObject industriasObject = (JSONObject) ciudad.get("industrias");
        ArrayList<String> industrias = new ArrayList<>();
        for(int i = 0; i < industriasObject.size() ; i++){
            industrias.add( (String) industriasObject.get(i) );
        }

        //Tenemos que agregar múltiples animales
        JSONObject animalesObject = (JSONObject) ciudad.get("animales");
        ArrayList<String> animales = new ArrayList<>();
        for(int i = 0; i < animalesObject.size() ; i++){
            animales.add( (String) animalesObject.get(i) );
        }

        //Tenemos que agregar múltiples etnias
        JSONObject etniasObject = (JSONObject) ciudad.get("etnias");
        ArrayList<String> etnias = new ArrayList<>();
        for(int i = 0; i < etniasObject.size() ; i++){
            etnias.add( (String) etniasObject.get(i) );
        }

        //Tenemos que agregar una lista de "otros"
        JSONObject otrosObject = (JSONObject) ciudad.get("otros");
        ArrayList<String> otros = new ArrayList<>();
        for(int i = 0; i < otrosObject.size() ; i++){
            otros.add( (String) otrosObject.get(i) );
        }

        //Esto no puede ser asi
        Ciudad newCiudad = new Ciudad(ciudad, colorBandera, moneda, geografia, caracteristicas, industrias, animales, etnias, idiomas, arte, religion, representante, otros, latitud, longitud, descripcion);
        return newCiudad;
    }

}

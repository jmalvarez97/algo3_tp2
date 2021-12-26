package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Policia.Policia;
import org.json.simple.JSONObject;
import java.util.ArrayList;

public class Ciudad {
    private final String nombre;
    private final String moneda;
    private final String geografia;
    private final String arte;
    private final String religion;
    private final String representante;
    private final double latitud;
    private final double longitud;
    private final String descripcion;
    private ArrayList<String> colorBandera = new ArrayList<>();
    private ArrayList<String> idiomas = new ArrayList<>();
    private ArrayList<String> caracteristicas = new ArrayList<>();
    private ArrayList<String> industrias = new ArrayList<>();
    private ArrayList<String> animales = new ArrayList<>();
    private ArrayList<String> etnias = new ArrayList<>();
    private ArrayList<String> otros = new ArrayList<>();



    Edificio banco; //Edificio bolsa;
    Edificio puerto; //Edificio aeropuerto;
    Edificio biblioteca;

    public Ciudad (String nombre, double latitud, double longitud, String moneda, String geografia, String arte, String religion, String representante, String descripcion, ArrayList<String> colorBandera , ArrayList<String> idiomas,ArrayList<String> caracteristicas, ArrayList<String> industrias, ArrayList<String> animales, ArrayList<String> etnias, ArrayList<String> otros ){
        //Leemos el nombre de la ciudad
        this.nombre = nombre;

        //Leemos la moneda
        this.moneda = moneda;

        //Leemos la geografia
        this.geografia = geografia;

        //Leemos el arte
        this.arte = arte;

        //Leemos la religion
        this.religion = religion;

        //Leemos el representante
        this.representante = representante;

        //Leemos el latitud
        this.latitud = latitud;

        //Leemos el longitud
        this.longitud = longitud;

        //Leemos la descripcion
        this.descripcion = descripcion;

        //Tenemos que agregar múltiples colores de bandera
        this.colorBandera=colorBandera;

        //Tenemos que agregar múltiples idiomas
        this.idiomas=idiomas;


        //Tenemos que agregar múltiples caracteristicas
        this.caracteristicas=caracteristicas;

        this.industrias=industrias;

        this.animales=animales;

        this.etnias=etnias;

        this.otros=otros;



        this.banco = new Banco();
        //this.bolsa = new Bolsa();
        this.puerto = new Puerto();
        //this.aeropuerto = new Aeropuerto();
        this.biblioteca = new Biblioteca();
    }

    public Ciudad(JSONObject ciudad){

        //Leemos el nombre de la ciudad
        this.nombre = (String) ciudad.get("ciudad");

        //Leemos la moneda
        this.moneda = (String) ciudad.get("moneda");

        //Leemos la geografia
        this.geografia = (String) ciudad.get("geografia");

        //Leemos el arte
        this.arte = (String) ciudad.get("arte");

        //Leemos la religion
        this.religion = (String) ciudad.get("religion");

        //Leemos el representante
        this.representante = (String) ciudad.get("representante");

        //Leemos el latitud
        this.latitud = (double) ciudad.get("latitud");

        //Leemos el longitud
        this.longitud = (double) ciudad.get("longitud");

        //Leemos la descripcion
        this.descripcion = (String) ciudad.get("descripcion");

        //Tenemos que agregar múltiples colores de bandera
        JSONObject coloresBanderaObject = (JSONObject) ciudad.get("colorBandera");
        for(int i = 0; i < coloresBanderaObject.size() ; i++){
            colorBandera.add( (String) coloresBanderaObject.get(i) );
        }

        //Tenemos que agregar múltiples idiomas
        JSONObject idiomasObject = (JSONObject) ciudad.get("idiomas");
        for(int i = 0; i < idiomasObject.size() ; i++){
            idiomas.add( (String) idiomasObject.get(i) );
        }


        //Tenemos que agregar múltiples caracteristicas
        JSONObject caracteristicasObject = (JSONObject) ciudad.get("caracteristicas");
        for(int i = 0; i < caracteristicasObject.size() ; i++){
            caracteristicas.add( (String) caracteristicasObject.get(i) );
        }

        //Tenemos que agregar múltiples industrias
        JSONObject industriasObject = (JSONObject) ciudad.get("industrias");
        for(int i = 0; i < industriasObject.size() ; i++){
            industrias.add( (String) industriasObject.get(i) );
        }

        //Tenemos que agregar múltiples animales
        JSONObject animalesObject = (JSONObject) ciudad.get("animales");
        for(int i = 0; i < animalesObject.size() ; i++){
            animales.add( (String) animalesObject.get(i) );
        }

        //Tenemos que agregar múltiples etnias
        JSONObject etniasObject = (JSONObject) ciudad.get("etnias");
        for(int i = 0; i < etniasObject.size() ; i++){
            etnias.add( (String) etniasObject.get(i) );
        }

        //Tenemos que agregar una lista de "otros"
        JSONObject otrosObject = (JSONObject) ciudad.get("otros");
        for(int i = 0; i < otrosObject.size() ; i++){
            otros.add( (String) otrosObject.get(i) );
        }



        this.banco = new Banco();
        //this.bolsa = new Bolsa();
        this.puerto = new Puerto();
        //this.aeropuerto = new Aeropuerto();
        this.biblioteca = new Biblioteca();

    }

    private String visitar(Ciudad proxima, Edificio unEdificio){
        return unEdificio.darPista(proxima);
    }

    // Devuelve el objeto edificio. Modificacion para poder reutilizar la funcion.
    public Edificio detectarEdificio(String unEdificio){

        if(unEdificio.equals("banco")){
            return this.banco;
        }

        if(unEdificio.equals("puerto")){
            return this.puerto;
        }

        return this.biblioteca;
    }

    public String visitar(Ciudad proxima, String unEdificio, Policia policia) {
        Edificio edificio = detectarEdificio(unEdificio);
        String pista = edificio.darPista(proxima);
        edificio.descontarHorasDePolicia(policia); // tambien se podria en darPista, cada pista dada lleva un tiempo
        return pista;

    }

    public String getMoneda(){
        return this.moneda;
    }
    public String getNombre() { return this.nombre; }
    public double getLatitud() {return this.latitud;}
    public double getLongitud() {return this.longitud;}
    public ArrayList<String> getColores() {return this.colorBandera;}
    public String getDatoRandom() {return this.arte;}
}


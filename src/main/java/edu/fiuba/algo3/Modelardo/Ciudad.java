package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Edificios.Aeropuerto;
import edu.fiuba.algo3.Modelardo.Edificios.Banco;
import edu.fiuba.algo3.Modelardo.Edificios.Biblioteca;
import edu.fiuba.algo3.Modelardo.Edificios.Edificio;
import edu.fiuba.algo3.Modelardo.Pistas.Pista;
import edu.fiuba.algo3.Modelardo.Policia.Policia;
import org.json.simple.JSONObject;

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
    private final String colorBandera;
    private final String idiomas;
    private final String caracteristicas;
    private final String industrias;
    private final String animales;
    private final String etnias;
    private final String otros;

    private final String MENSAJE_BANCO="Bienvenido al Banco Policía. Esta es la información que le puedo dar: ";
    private final String MENSAJE_AEROPUERTO = "Bienvenido al Aeropuerto Policía. Esta es la información que le puedo dar: ";
    private final String MENSAJE_BIBLIOTECA = "Bienvenido a la Biblioteca Policía. Esta es la información que le puedo dar: ";

    Edificio banco; //Edificio bolsa;
    Edificio aeropuerto; //Edificio aeropuerto;
    Edificio biblioteca;

    public Ciudad (String nombre, double latitud, double longitud, String moneda, String geografia, String arte, String religion, String representante, String descripcion, String colorBandera ,String idiomas,String caracteristicas, String industrias, String animales, String etnias, String otros ){
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
        this.aeropuerto = new Aeropuerto();
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

        //Tenemos que agregar colores de bandera
        this.colorBandera=(String) ciudad.get("colorBandera");
        /*
        JSONArray coloresBanderaObject = (JSONArray) ciudad.get("colorBandera");
        for(int i = 0; i < coloresBanderaObject.size() ; i++){
            colorBandera.add( (String) coloresBanderaObject.get(i) );


        }

         */

        //Tenemos que agregar idiomas
        this.idiomas = (String) ciudad.get("idiomas");
        /*
        JSONArray idiomasObject = (JSONArray) ciudad.get("idiomas");
        for(int i = 0; i < idiomasObject.size() ; i++){
            idiomas.add( (String) idiomasObject.get(i) );

        }

         */


        //Tenemos que agregar caracteristicas
        this.caracteristicas=(String) ciudad.get("caracteristicas");
        /*
        JSONArray caracteristicasObject = (JSONArray) ciudad.get("caracteristicas");
        for(int i = 0; i < caracteristicasObject.size() ; i++){
            caracteristicas.add( (String) caracteristicasObject.get(i) );


        }

         */

        //Tenemos que agregar industrias
        this.industrias=(String) ciudad.get("industrias");
        /*
        JSONArray industriasObject = (JSONArray) ciudad.get("industrias");
        for(int i = 0; i < industriasObject.size() ; i++){
            industrias.add( (String) industriasObject.get(i) );


        }

         */

        //Tenemos que agregar animales
        this.animales=(String) ciudad.get("animales");
        /*
        JSONArray animalesObject = (JSONArray) ciudad.get("animales");
        for(int i = 0; i < animalesObject.size() ; i++){
            animales.add( (String) animalesObject.get(i) );


        }

         */

        //Tenemos que agregar etnias
        this.etnias=(String) ciudad.get("etnias");
        /*
        JSONArray etniasObject = (JSONArray) ciudad.get("etnias");
        for(int i = 0; i < etniasObject.size() ; i++){
            etnias.add( (String) etniasObject.get(i) );


        }

         */

        //Tenemos que agregar "otros"
        this.otros=(String)  ciudad.get("otros");
        /*
        JSONArray otrosObject = (JSONArray) ciudad.get("otros");
        for(int i = 0; i < otrosObject.size() ; i++){
            otros.add( (String) otrosObject.get(i) );


        }

         */




        this.banco = new Banco();
        this.aeropuerto = new Aeropuerto();
        this.biblioteca = new Biblioteca();

    }

    // Devuelve el objeto edificio. Modificacion para poder reutilizar la funcion.
    public Edificio detectarEdificio(String unEdificio){

        if(unEdificio.equals("Banco")){
            return this.banco;
        }

        if(unEdificio.equals("Aeropuerto")){
            return this.aeropuerto;
        }

        return this.biblioteca;
    }

    public String pistaColores() {return MENSAJE_AEROPUERTO+this.colorBandera;}
    public String pistaMoneda() {return (MENSAJE_BANCO + this.moneda);}
    public String pistaArte() {return MENSAJE_BIBLIOTECA+this.arte;}
    public String pistaReligion(){return MENSAJE_BIBLIOTECA+this.religion;}
    public String pistaRepresentante(){return MENSAJE_BANCO+this.representante;}
    public String pistaGeografia(){return MENSAJE_AEROPUERTO+this.geografia;}
    public String pistaEtnias(){return MENSAJE_BIBLIOTECA+this.etnias;}
    public String pistaIndustria(){return MENSAJE_BANCO+this.industrias;}
    public String pistaIdiomas(){return MENSAJE_AEROPUERTO+this.idiomas;}


    public String visitar(Ciudad proxima, String unEdificio, Policia policia) {
        Edificio edificio = detectarEdificio(unEdificio);
        Pista pistaValor = policia.pistaValorCorrespondiente();
        String pista = edificio.darPista(pistaValor, proxima);
        edificio.descontarHorasDePolicia(policia); // tambien se podria en darPista, cada pista dada lleva un tiempo
        return pista;

    }




    public String getNombre() { return (this.nombre); }
    public double getLatitud() {return this.latitud;}
    public double getLongitud() {return this.longitud;}
    public String getDescripcion() {return this.descripcion;}
}


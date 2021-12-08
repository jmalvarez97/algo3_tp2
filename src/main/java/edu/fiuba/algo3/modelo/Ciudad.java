package edu.fiuba.algo3.modelo;

public class Ciudad {
    private String moneda;
    private String coloresDeBandera;
    private String datoRandom;
    Edificio banco; //Edificio bolsa;
    Edificio puerto; //Edificio aeropuerto;
    Edificio biblioteca;


    public Ciudad(String colores, String moneda, String datoRandom){
        this.moneda = moneda;
        this.coloresDeBandera = colores;
        this.datoRandom = datoRandom;

        //leemos un json para definir si vamos a crear un banco o bolsa/puerto o aeropuerto
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

    public String getColores(){
        return this.coloresDeBandera;
    }

    public String getDatoRandom(){ return this.datoRandom;}
}


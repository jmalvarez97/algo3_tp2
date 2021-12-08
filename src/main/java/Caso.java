
public class Caso {

    private Policia policia;
    private Ladron ladron;

    private Mapa mapa;


    // Constructor con Mapa, lo generamos aleatorio?
    public Caso(Policia policia, Ladron ladron, Mapa unMapa){
        this.ladron = ladron;
        this.policia = policia;
        this.mapa = unMapa;
    }



    public String visitar(String unEdificio) {
        String pista = mapa.visitar(unEdificio,policia);
        return pista;
    }

    /*
    public void descontarHoras(String unEdificio){
        // Le mando todos los datos a policia
        int cantidadVisitas = mapa.getVisitas(unEdificio);
        if(cantidadVisitas > 3){cantidadVisitas = 3;} //Le pertenece a edificio
        this.policia.descontarHoras(cantidadVisitas);
    }
     */

    public String generarObjetoRobado() {
        return "Tesoro Nacional";
    }

    public void herirPoliciaConCuchillo(){
        this.policia.herirConCuchillo();
    }

    public void viajar(Ciudad ciudadActual){

        // TODO: generar ciudad de manera random. Investigar JSON.
        Ciudad baires = new Ciudad("celeste y blanca", "pesos argentinos", "el tango");
        mapa = new Mapa(ciudadActual, baires);

        //Montreal-Mexico ≃ 3581 km
        this.policia.descontarHoras(3581 / this.policia.velocidad());
        // TODO: clase Google Maps, calcular distancias.
    }

    public Ciudad ciudadActual(){
        return this.mapa.ciudadActual();
    }
}

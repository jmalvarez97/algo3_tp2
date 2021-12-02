
public class Caso {

    private Policia policia;
    private Ladron ladron;

    private Mapa mapa;

    public Caso(Policia policia, Ladron ladron){
        this.ladron = ladron;
        this.policia = policia;
    }

    //Ruido, estos setters para nuestro tp se asignan aletoriamente
    public void asignarCiudadProxima(CiudadProxima ciudad) {
        this.proxima = ciudad;
    }

    public void asignarCiudadActual(CiudadActual ciudad) {
        this.actual = ciudad;
    }

    public String visitar(String unEdificio) {
        String pista = mapa.visitar(unEdificio);

        descontarHoras(unEdificio);

        return pista;
        //String pista =  actual.visitar(proxima);
        //policia.descontarHoras(1);
        //return pista;
    }

    public void descontarHoras(String unEdificio){
        int cantidadVisitas = mapa.getVisitas(unEdificio);

        if(cantidadVisitas > 3){cantidadVisitas = 3;}

        this.policia.descontarHoras(cantidadVisitas);
    }

    public String generarObjetoRobado() {
        return "Tesoro Nacional";
    }

    public void viajar(CiudadActual unaCiudad){

        // TODO: generar ciudad de manera random. Investigar JSON.
        CiudadProxima baires = new CiudadProxima("celeste y blanca", "pesos argentinos", "el tango");
        caso.asignarCiudadActual(mexicoNuevo);
        caso.asignarCiudadProxima(baires);

        /*
        Montreal-Mexico ≃ 3581 km
        VelocidadNovato = 900 km/h

        => tiempoDeViaje ≃ 4 hs
         */
        this.policia.descontarHoras(4);
        // TODO: clase Google Maps, calcular distancias.
    }
}

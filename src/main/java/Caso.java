
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
}

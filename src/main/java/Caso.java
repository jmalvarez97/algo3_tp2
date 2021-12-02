
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

    public void descontarTiempo(int cantidadDeHoras){

    }

    public String visitar(String unEdificio) {
        mapa.visitar(unEdificio);


        //String pista =  actual.visitar(proxima);
        //policia.descontarHoras(1);
        //return pista;
    }

    public String generarObjetoRobado() {
        return "Tesoro Nacional";
    }
}

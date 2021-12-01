
public class Caso {

    private int tiempoRestante;
    private Policia policia;
    private Ladron ladron;
    private CiudadActual actual;
    private CiudadProxima proxima;

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

    public String visitarBanco() {
        String pista =  actual.visitarBanco(proxima);
        policia.descontarHoras(1);
        return pista;
    }

    public String generarObjetoRobado() {
        return "Tesoro Nacional";
    }
}

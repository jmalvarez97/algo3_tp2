public class Mapa {

    private CiudadActual actual;
    private CiudadProxima proxima;

    public String visitar(String unEdificio){
        return actual.visitar(proxima, unEdificio);
    }

    public int getVisitas(String unEdificio){
        return ciudadActual.getVisitas(unEdificio);
    }


}
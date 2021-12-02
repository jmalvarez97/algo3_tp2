public class Mapa {

    private CiudadActual actual;
    private CiudadProxima proxima;


    public Mapa(CiudadActual actual, CiudadProxima proxima){
        this.actual = actual;
        this.proxima = proxima;
    }
    public String visitar(String unEdificio){
        return actual.visitar(proxima, unEdificio);
    }

    public int getVisitas(String unEdificio){
        return actual.getVisitas(unEdificio);
    }


}

public class Mapa {

    private CiudadActual actual;
    private CiudadProxima proxima;


    public Mapa(CiudadActual actual, CiudadProxima proxima){
        this.actual = actual;
        this.proxima = proxima;
    }

    public String visitar(String unEdificio, Policia policia){
        return actual.visitar(proxima, unEdificio, policia);
    }

    public int getVisitas(String unEdificio){
        return actual.getVisitas(unEdificio);
    }

    public CiudadActual ciudadActual(){
        return this.actual;
    }


}

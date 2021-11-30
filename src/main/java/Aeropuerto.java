public class Aeropuerto implements Edificio{

    private Pista pista;


    public Aeropuerto(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Aeropuerto");
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista.darPista(ciudad.getColores());
    }
}

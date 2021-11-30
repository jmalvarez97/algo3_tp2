public class Bolsa implements Edificio{


    private Pista pista;

    public Bolsa(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Bolsa");
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista.darPista(ciudad.getDatoRandom());
    }
}

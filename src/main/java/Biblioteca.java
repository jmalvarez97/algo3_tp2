public class Biblioteca implements Edificio{

    private Pista pista;

    public Biblioteca(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Biblioteca");
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista.darPista(ciudad.getDatoRandom());
    }
}

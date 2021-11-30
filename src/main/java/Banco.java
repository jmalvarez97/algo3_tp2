public class Banco implements Edificio{

    private Pista pista;

    public Banco(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Banco");
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista.darPista(ciudad.getMoneda());
    }
}


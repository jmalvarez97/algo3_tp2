public class Biblioteca implements Edificio{

    private Pista pista;
    private int contadorVisitas;

    public Biblioteca(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Biblioteca");
        this.contadorVisitas = 0;
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        this.contadorVisitas++;
        return this.pista.darPista(ciudad.getDatoRandom());
    }

    @Override
    public int cantidadVisitas(){
        return this.contadorVisitas;
    }
}

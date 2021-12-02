public class Bolsa implements Edificio{


    private Pista pista;
    private int contadorVisitas;

    public Bolsa(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Bolsa");
        this.contadorVisitas = 0;
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        this.contadorVisitas++;
        return this.pista.darPista(ciudad.getDatoRandom());
    }

    @Override
    public int cantidadVisitas() {
        return this.contadorVisitas;
    }
}

public class Aeropuerto implements Edificio{

    private Pista pista;
    private int contadorVisitas;


    public Aeropuerto(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Aeropuerto");
        this.contadorVisitas = 0;
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        this.contadorVisitas++;
        return this.pista.darPista(ciudad.getColores());
    }

    @Override
    public int cantidadVisitas() {
        return this.contadorVisitas;
    }
}

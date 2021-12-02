public class Puerto implements Edificio{

    private Pista pista;
    private int contadorVisitas;

    public Puerto(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Puerto");
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista.darPista(ciudad.getMoneda());
    }

    @Override
    public int cantidadVisitas() {
        return this.contadorVisitas;
    }
}

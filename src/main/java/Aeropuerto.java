public class Aeropuerto implements Edificio{

    private String pista;


    public Aeropuerto(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = "cuando llego venia con una bandera de colores ";
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista + ciudad.getColores();
    }
}

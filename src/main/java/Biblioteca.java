public class Biblioteca implements Edificio{

    private String pista;


    public Biblioteca(){
        this.pista = "estaba leyendo sobre ";
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista + ciudad.getDatoRandom();
    }
}

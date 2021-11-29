public class Biblioteca implements Edificio{

    private String pista;


    public void Biblioteca(){
        this.pista = "estaba leyendo unos libros de";
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista + ciudad.getDatoRandom();
    }
}

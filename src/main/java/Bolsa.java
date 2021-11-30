public class Bolsa implements Edificio{


    private String pista;


    public Bolsa(){
        this.pista = "lo vi cambiando su moneda a ";
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista + ciudad.getMoneda();
    }
}

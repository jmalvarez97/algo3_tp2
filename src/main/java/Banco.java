public class Banco implements Edificio{

    private String pista;


    public Banco(){
        this.pista = "lo vi cambiando su moneda a ";
    }

    @Override
    public String darPista(CiudadProxima ciudad){
        return this.pista + ciudad.getMoneda();
    }
}


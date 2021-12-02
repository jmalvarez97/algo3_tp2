public class CiudadActual {
    //Decidir en funcion de que vamos a crear bancos/bolsas o puertos/aeropuertos
    Edificio banco;
    //Edificio bolsa;
    Edificio puerto;
    //Edificio aeropuerto;
    Edificio biblioteca;

    public CiudadActual(){
        //leemos un json para definir si vamos a crear un banco o bolsa/puerto o aeropuerto
        this.banco = new Banco();
        //this.bolsa = new Bolsa();
        this.puerto = new Puerto();
        //this.aeropuerto = new Aeropuerto();
        this.biblioteca = new Biblioteca();
    }

    public String visitar(CiudadProxima proxima, String unEdificio) {

        detectarEdificio(proxima, unEdificio);
    }

    private String visitar(CiudadProxima proxima, Edificio unEdificio){
        return unEdificio.darPista(proxima);
    }

    public void detectarEdificio(CiudadProxima proxima, String unEdificio){
        if(unEdificio.equals("banco")){
            visitar(proxima, this.banco);
        }
        if(unEdificio.equals("puerto")){
            visitar(proxima, this.puerto);
        }
        if(unEdificio.equals("biblioteca")){
            visitar(proxima, this.biblioteca);
        }
    }






    //Ladron ladron = new Ladron();
}

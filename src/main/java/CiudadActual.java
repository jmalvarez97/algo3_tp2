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

        Edificio edificio = detectarEdificio(unEdificio);

        return edificio.darPista(proxima);
    }

    private String visitar(CiudadProxima proxima, Edificio unEdificio){
        return unEdificio.darPista(proxima);
    }

    /*

    ESTO YA NO SERIA NECESARIO

    public String detectarEdificio(CiudadProxima proxima, String unEdificio){
        if(unEdificio.equals("banco")){
            return visitar(proxima, this.banco);
        }
        if(unEdificio.equals("puerto")){
            return visitar(proxima, this.puerto);
        }
        if(unEdificio.equals("biblioteca")){
            return visitar(proxima, this.biblioteca);
        }
    }
    */

    // Devuelve el objeto edificio. Modificacion para poder reutilizar la funcion.
    public Edificio detectarEdificio(String unEdificio){

        if(unEdificio.equals("banco")){
            return this.banco;
        }

        if(unEdificio.equals("puerto")){
            return this.puerto;
        }

        return this.biblioteca;
    }

    public int getVisitas(String unEdificio){
        Edificio edificio = detectarEdificio(unEdificio);

        return edificio.cantidadVisitas();
    }





    //Ladron ladron = new Ladron();
}
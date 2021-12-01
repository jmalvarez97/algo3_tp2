public class CiudadActual {
    //Decidir en funcion de que vamos a crear bancos/bolsas o puertos/aeropuertos
    Edificio banco = new Banco();
    Edificio bolsa = new Bolsa();
    Edificio puerto = new Puerto();
    Edificio aeropuerto = new Aeropuerto();
    Edificio biblioteca = new Biblioteca();

    public String visitarBanco(CiudadProxima proxima) {
        return banco.darPista(proxima);

    }
    //Ladron ladron = new Ladron();
}

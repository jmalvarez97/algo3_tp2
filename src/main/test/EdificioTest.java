import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdificioTest {

    @Test
    public void testCreoUnBancoYMeDaLaPistaDeLaCiudadProxima(){
        Edificio banco = new Banco();
        CiudadProxima ciudadProxima = new CiudadProxima("roja blanca y azul","euros", "torre eiffel");

        String pista = banco.darPista(ciudadProxima);
        assertEquals(pista, "Lo vi cambiando su moneda a euros");
    }

    @Test
    public void testCreoUnAeropuertoYMeDaLaPistaDeLaCiudadProxima(){
        Edificio aeropuerto = new Aeropuerto();
        CiudadProxima ciudadProxima = new CiudadProxima("roja blanca y azul","francos", "torre eiffel");

        String pista = aeropuerto.darPista(ciudadProxima);
        assertEquals(pista, "Cuando llego venia con una bandera de colores roja blanca y azul");
    }

    @Test
    public void testCreoUnaBibliotecaYMeDaLaPistaDeCiudadProxima(){
        Edificio biblioteca = new Biblioteca();
        CiudadProxima ciudadProxima = new CiudadProxima("roja blanca y azul","francos", "la torre eiffel");

        String pista = biblioteca.darPista(ciudadProxima);
        assertEquals(pista, "Estaba leyendo sobre la torre eiffel");
    }
}

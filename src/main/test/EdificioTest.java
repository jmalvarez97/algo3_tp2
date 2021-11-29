import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdificioTest {

    @Test
    public void testCreoUnEdificioYMeDaLaPistaDeLaCiudadProxima(){
        Edificio banco = new Banco();
        CiudadProxima ciudadProxima = new CiudadProxima("roja blanca y azul","francos", "toma de la bastilla");

        String pista = banco.darPista(ciudadProxima);
        assertEquals(pista, "lo vi cambiando su moneda a francos");
    }

}

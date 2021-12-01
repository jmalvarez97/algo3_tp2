import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoTest {

    private Policia policia = new Novato();
    private Ladron ladron = new Ladron();
    private Caso caso = new Caso(policia, ladron);

    @Test
    public void testCasoUno(){

        /*
        Caso de uso 1

        Robaron el tesoro Nacional de Montreal.
        Sospechoso femenino.
        Detective novato comienza en Montreal.
        Vista un Banco:
        se despliega una pista.
         */

        CiudadActual montreal = new CiudadActual();
        CiudadProxima mexico = new CiudadProxima("roja blanca y verde","pesos","civilizacion azteca");

        caso.generarObjetoRobado();
        caso.asignarCiudadActual(montreal);
        caso.asignarCiudadProxima(mexico);
        String pista = caso.visitarBanco();

        assert(pista.contains("pesos"));
        assertEquals(policia.horasDisponibles(), 154-1);

    }
}

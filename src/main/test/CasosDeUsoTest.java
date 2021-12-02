import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoTest {

    private Policia policia = new Novato();
    private Ladron ladron = new Ladron();

    // Van aca para que en el caso2 se mantenga la cantidad de visitas en Banco
    CiudadActual montreal = new CiudadActual();
    CiudadProxima mexico = new CiudadProxima("roja blanca y verde","pesos","civilizacion azteca");
    Mapa unMapa = new Mapa(montreal,mexico);

    private Caso caso = new Caso(policia, ladron, unMapa );

    @Test
    public void testCasoUno(){
        /* Caso de uso 1:
        - Robaron el tesoro Nacional de Montreal.
        - Sospechoso femenino.
        - Detective novato comienza en Montreal.
        - Vista un Banco:
            - se despliega una pista. */
        caso.generarObjetoRobado();
        String pista = caso.visitar("banco");

        assert(pista.contains("pesos"));
        assertEquals(policia.horasDisponibles(), 154-1);
    }

    @Test
    public void testCasoDos(){
        /* Caso de uso 2:
        - Detective novato comienza en Montreal.
        - Vista un Banco (nuevamente):
            - Se despliega una pista
        - Vista una Biblioteca:
            - Se despliega una pista. */

        caso.generarObjetoRobado();

        caso.visitar("banco");
        String pista = caso.visitar("banco");
        String pista2 = caso.visitar("biblioteca");

        assert(pista.contains("pesos"));
        assert(pista2.contains("civilizacion azteca"));
        assertEquals(policia.horasDisponibles(), 153 - 3);
    }

    @Test
    public void testCasoTres(){
        /* Caso de uso 3
        - Detective viaja de Montreal a México */

        caso.generarObjetoRobado();

        caso.visitar("banco");
        String pista = caso.visitar("banco");
        String pista2 = caso.visitar("biblioteca");

        CiudadActual mexicoActual = new CiudadActual();
        caso.viajar(mexicoActual);

        assertEquals(policia.horasDisponibles(), 150 - 4);
    }
}

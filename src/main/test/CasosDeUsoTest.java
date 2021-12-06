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
        assertEquals(policia.horasRestantes(), 154-1);
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
        assertEquals(policia.horasRestantes(), 154 - 4);
    }

    @Test
    public void testCasoTres(){
        /* Caso de uso 3
        - Detective viaja de Montreal a México */

        CiudadActual mexicoActual = new CiudadActual();
        caso.viajar(mexicoActual);

        assertEquals(mexicoActual, caso.ciudadActual());
        assertEquals(policia.horasRestantes(), 154-4);
    }

    @Test
    public void testCasoCuatro(){
        /*
        Caso de uso 4
        Vista un Aeropuerto (3 veces):
        Se despliega una pista.
        Vista un Puerto (55 veces):
        Se despliega una pista.
        */

        for(int i=0;i<3;i++){
            caso.visitar("aeropuerto");
        }

        for(int i=0;i<5;i++){
            caso.visitar("banco");
        }

        int tiempoRestanteEsperado = 154 - (1 + 2 + 3) - (1 + 2 + 3 + 3 + 3);
        assertEquals(policia.horasRestantes(),tiempoRestanteEsperado);
    }

    @Test
    public void testHerirConCuchilloUnaVez(){
        assertEquals(policia.horasRestantes(), 154);
        caso.herirPoliciaConCuchillo();
        assertEquals(policia.horasRestantes(), 152);
    }

    @Test
    public void testHerirConCuchilloVariasVeces(){
        assertEquals(policia.horasRestantes(),154);
        caso.herirPoliciaConCuchillo();
        caso.herirPoliciaConCuchillo();
        assertEquals(policia.horasRestantes(),151);
    }
}

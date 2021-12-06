import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoEntrega2Test {

    private Policia policia = new Novato();
    private Ladron ladron = new Ladron();

    // Van aca para que en el caso2 se mantenga la cantidad de visitas en Banco
    CiudadActual montreal = new CiudadActual();
    CiudadProxima mexico = new CiudadProxima("roja blanca y verde","pesos","civilizacion azteca");
    Mapa unMapa = new Mapa(montreal,mexico);

    private Caso caso = new Caso(policia, ladron, unMapa );

    @Test
    public void testCasoUno(){

        /*
        - Detective sufre una herida de cuchillo.
        - Detective duerme.
         */

        //Hora actual: 7 am
        caso.herirPoliciaConCuchillo();
        assertEquals(policia.horasRestantes(),154 - 2);

        //Hora actual: 9 am
        // Para la hora de dormir faltan 14 hs
        assertEquals(policia.hora(), 9);
        policia.descontarHoras(14);

        //Hora actual: 7 am
        assertEquals(policia.horasRestantes(), 130);
        assertEquals(policia.hora(), 7);
    }

    @Test
    public void testCasoDos(){
        // Detective con rango Investigador toma caso de un robo viaja de Montreal a México

        policia = new Investigador();
        caso = new Caso(policia, ladron, unMapa );

        CiudadActual mexicoActual = new CiudadActual();
        caso.viajar(mexicoActual);

        assertEquals(caso.ciudadActual(), mexicoActual);
        assertEquals(policia.horasRestantes(),154 - 2);
    }
}


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoliciaTest {

    private Policia policia = new Novato();
    private Ladron ladron = new Ladron();

    // Van aca para que en el caso2 se mantenga la cantidad de visitas en Banco
    CiudadActual montreal = new CiudadActual();
    CiudadProxima mexico = new CiudadProxima("roja blanca y verde","pesos","civilizacion azteca");
    Mapa unMapa = new Mapa(montreal,mexico);

    private Caso caso = new Caso(policia, ladron, unMapa );


    @Test
    public void testLeDescuentoHorasAUnPolicia(){

        // Todo policia tiene 154 hs
        policia.descontarHoras(8);

        assertEquals(policia.horasRestantes(), 154 - 8);
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

    @Test
    public void testSeHaceDeNochePoliciaDuerme(){
        assertEquals(policia.horasRestantes(),154);
        policia.descontarHoras(20); // Se hace de noche
        assertEquals(policia.horasRestantes(), 154 - 20 - 8);
        assertEquals(policia.hora(), 11); // Se despierta 11am
    }
}

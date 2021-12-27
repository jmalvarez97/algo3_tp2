package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Policia.Policia;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoliciaTest {

    private Ladron ladron = new Ladron();
    private Policia policia = new Policia(new ArrayList<Ladron>(){{add(ladron);}});
    private Tesoro tesoro = new Tesoro("Montreal", "Tesoro Nacional de Montreal", "Comun");


    // Van aca para que en el caso2 se mantenga la cantidad de visitas en Banco
    Ciudad montreal = new Ciudad("Montreal",37.984167,23.728056,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Ciudad mexico = new Ciudad ("Mexico",33.35,44.416667,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Mapa unMapa = new Mapa(montreal,mexico, new ArrayList<Ciudad>(){{add(montreal); add(mexico);}});

    private Caso caso = new Caso(policia, tesoro, ladron, unMapa );

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

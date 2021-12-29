package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Decorator.*;
import edu.fiuba.algo3.Modelardo.Policia.Policia;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoliciaTest {

    private Ladron ladron = new Ladron("Castaño", "Tenis", "Descapotable Packard 1939", "Femenino", "Jamás se muestra en público sin su collar de rubíes");
    private Policia policia = new Policia();
    private Tesoro tesoro = new Tesoro("Montreal", "Tesoro Nacional de Montreal", "Comun");
    private Tesoro tesoro2 = new Tesoro("Buenos Aires", "Sombrero de Gardel", "Valioso");
    private ArrayList<Tesoro> listaTesoros = new ArrayList<Tesoro>(){{add(tesoro); add(tesoro2);}};
    private Computadora computadora = new Computadora(new ArrayList<Ladron>(){{add(ladron);}});


    // Van aca para que en el caso2 se mantenga la cantidad de visitas en Banco
    Ciudad montreal = new Ciudad("Montreal",37.984167,23.728056,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Ciudad mexico = new Ciudad ("Mexico",33.35,44.416667,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Mapa unMapa = new Mapa(montreal,mexico, new ArrayList<Ciudad>(){{add(montreal); add(mexico);}});

    private Caso caso = new Caso(policia, tesoro, ladron, unMapa, computadora);

    @Test
    public void testLeDescuentoHorasAUnPolicia(){

        // Todo policia tiene 154 hs
        policia.descontarHoras(8);

        assertEquals(policia.horasRestantes(), 154 - 8);
    }

    @Test
    public void testLeDescuentoHorasDeViajeAUnPoliciaNovatoQueRecorrio900Km(){
        policia.descontarHorasDeViaje(900);

        assertEquals(policia.horasRestantes(), 154 - 1);
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

    @Test
    public void testUnNovatoArresta10LadronesSeConvierteEnInvestigador(){
        for(int i = 0; i < 10; i++) {
            policia.confirmarCaso();
        }

        assertEquals(policia.velocidad(), 1300);

    }

    @Test
    public void testDetectiveAgarraCasoConTesoroValioso() {
        for(int i = 0; i < 5; i++) {
            policia.confirmarCaso();
        }

        Tesoro nuevoTesoro = policia.devolverTesoroAcorde(listaTesoros);

        assert(nuevoTesoro.esValor("Valioso"));
    }

}

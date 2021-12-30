package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Decorator.Ladron;
import edu.fiuba.algo3.Modelardo.Policia.Policia;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoEntrega1Test {

    private Ladron ladron = new Ladron();
    private Policia policia = new Policia();
    private Tesoro tesoro = new Tesoro("Montreal", "Tesoro Nacional de Montreal", "Comun");
    private Computadora computadora = new Computadora(new ArrayList<Ladron>(){{add(ladron);}});

    // Van aca para que en el caso2 se mantenga la cantidad de visitas en Banco
    Ciudad montreal = new Ciudad("Montreal",37.984167,23.728056,null,null,null,null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad mexico = new Ciudad ("Mexico",33.35,44.416667,"pesos",null,"civilizacion azteca",null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad buenosaires = new Ciudad("buenosaires",37.984167,23.728056,null,null,null,null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad bamako = new Ciudad ("bamako",33.35,44.416667,"pesos",null,"civilizacion azteca",null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad jamaica = new Ciudad("jamaica",37.984167,23.728056,null,null,null,null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad paris = new Ciudad ("paris",33.35,44.416667,"pesos",null,"civilizacion azteca",null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad rio = new Ciudad("rio",37.984167,23.728056,null,null,null,null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad londres = new Ciudad ("londres",33.35,44.416667,"pesos",null,"civilizacion azteca",null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad moscu = new Ciudad("Montreal",37.984167,23.728056,null,null,null,null,null,null,"blanco",null,null,null,null,null,null);


    Mapa unMapa = new Mapa(montreal,mexico, new ArrayList<Ciudad>(){{add(montreal); add(mexico);add(buenosaires);add(bamako);add(jamaica);add(paris);add(rio);add(londres);add(moscu);}});

    private Caso caso = new Caso(policia, tesoro, ladron, unMapa, computadora);


    @Test
    public void testCasoUno(){
        /* Caso de uso 1:
        - Robaron el tesoro Nacional de Montreal.
        - Sospechoso femenino.
        - Detective novato comienza en Montreal.
        - Vista un Banco:
            - se despliega una pista. */
        String pista = caso.visitar("Banco");

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

        caso.visitar("banco");
        String pista = caso.visitar("Banco");
        String pista2 = caso.visitar("Biblioteca");

        assert(pista.contains("pesos"));
        assert(pista2.contains("civilizacion azteca"));
        assertEquals(policia.horasRestantes(), 154 - 4);
    }

    @Test
    public void testCasoTres(){
        /* Caso de uso 3
        - Policia novato viaja de Montreal a México */

        policia.descontarHorasDeViaje(unMapa.viajar(mexico, tesoro));
        double horasDeVuelo = 21 * 111/ 900;

        assertEquals(mexico, caso.ciudadActual());
        assertEquals(policia.horasRestantes(), 154-horasDeVuelo);
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
            caso.visitar("Aeropuerto");
        }

        for(int i=0;i<5;i++){
            caso.visitar("Banco");
        }

        int tiempoRestanteEsperado = 154 - (1 + 2 + 3) - (1 + 2 + 3 + 3 + 3) - 8;
        assertEquals(policia.horasRestantes(),tiempoRestanteEsperado);
    }
}

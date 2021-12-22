package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoEntrega1Test {

    private Ladron ladron = new Ladron();
    private Policia policia = new Policia(new ArrayList<Ladron>(){{add(ladron);}});
    private Tesoro tesoro = new Tesoro();

    // Van aca para que en el caso2 se mantenga la cantidad de visitas en Banco
    Ciudad montreal = new Ciudad("rojo y blanco","dolar canadiense","segundo pais mas grande");
    Ciudad mexico = new Ciudad("roja blanca y verde","pesos","civilizacion azteca");
    Mapa unMapa = new Mapa(montreal,mexico, new ArrayList<Ciudad>(){{add(montreal); add(mexico);}});

    private Caso caso = new Caso(policia, tesoro, ladron, unMapa );


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

        unMapa.viajar(mexico);

        assertEquals(mexico, caso.ciudadActual());
        assertEquals(policia.horasRestantes(), 154-3);
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

        int tiempoRestanteEsperado = 154 - (1 + 2 + 3) - (1 + 2 + 3 + 3 + 3) - 8;
        assertEquals(policia.horasRestantes(),tiempoRestanteEsperado);
    }
}

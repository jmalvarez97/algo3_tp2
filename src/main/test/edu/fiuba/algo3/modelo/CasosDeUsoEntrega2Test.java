package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoEntrega2Test {

    private Policia policia = new Policia();
    private Ladron ladron = new Ladron();

    // Van aca para que en el caso2 se mantenga la cantidad de visitas en Banco
    Ciudad montreal = new Ciudad("rojo y blanco"," dolar canadiense", "segundo pais mas grande");
    Ciudad mexico = new Ciudad("roja blanca y verde","pesos","civilizacion azteca");
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

        for(int i = 0; i<10 ; i++){
            policia.confirmarCaso();
        }

        Ciudad mexicoActual = new Ciudad("roja blanca y verde","pesos","civilizacion azteca");
        caso.viajar(mexicoActual);

        assertEquals(caso.ciudadActual(), mexicoActual);
        assertEquals(policia.horasRestantes(),154-2);
    }

    @Test
    public void testCasoTres{
        //Caso de uso 3
        //Cargar en la computadora los datos recopilados y buscar sospechosos.



    }
}


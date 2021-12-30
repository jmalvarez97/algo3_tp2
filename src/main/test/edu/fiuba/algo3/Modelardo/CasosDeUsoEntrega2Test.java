package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Decorator.Ladron;
import edu.fiuba.algo3.Modelardo.Policia.Policia;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoEntrega2Test {
    private Ladron ladron = new Ladron("Castaño", "Tenis", "Descapotable Packard 1939", "Femenino", "Jamás se muestra en público sin su collar de rubíes");
    private Policia policia = new Policia();
    private Tesoro tesoro = new Tesoro("Montreal", "Tesoro Nacional de Montreal", "Comun");
    private Computadora computadora = new Computadora(new ArrayList<Ladron>(){{add(ladron);}});

    // Van aca para que en el caso2 se mantenga la cantidad de visitas en Banco
    Ciudad montreal = new Ciudad("Montreal",37.984167,23.728056,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Ciudad mexico = new Ciudad ("Mexico",33.35,44.416667,null,null,null,null,null,null,null,null,null,null,null,null,null);
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

        policia.descontarHorasDeViaje(unMapa.viajar(mexico, tesoro));
        double horasDeVuelo = 21 * 111 / 1300;

        assertEquals(caso.ciudadActual(), mexico);
        assertEquals(policia.horasRestantes(),154-horasDeVuelo);
    }

    @Test
    public void testCasoTres(){
        //Caso de uso 3
        //Cargar en la computadora los datos recopilados y buscar sospechosos.

        // Cargamos los datos correspondientes a 'Carmen Sandiego'
        computadora.cargarSexo("Femenino");
        computadora.cargarPelo("Castaño");
        computadora.cargarHobby("Tenis");
        computadora.cargarVehiculo("Descapotable Packard 1939");

        // Debería dar un solo sospechoso y generar la orden de arresto
        ArrayList<Ladron> listaSospechosos = computadora.buscarSospechosos();

        Assert.assertEquals(listaSospechosos.size(), 1);

        // La orden de arresto emitida corresponde al ladron buscado
        assertTrue(computadora.chequearOrdenDeArresto(ladron));

    }

    @Test
    public void testCasoCuatro() {
        // Caso de uso 4
        // Se intenta atrapar al sospechoso sin tener la orden de arresto emitida
        assert(!(computadora.chequearOrdenDeArresto(ladron)));
    }
}


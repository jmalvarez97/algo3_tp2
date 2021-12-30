package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Decorator.Ladron;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComputadoraTest {
    private Ladron ladron1 = new Ladron("Castaño", "Tenis", "Descapotable Packard 1939", "Femenino", "Jamás se muestra en público sin su collar de rubíes");
    private Ladron ladron2 = new Ladron("Rubio", "Futbol", "Descapotable Packard 1940", "Masculino", "Jamás se muestra en público sin su collar de rubíes");
    private Ladron ladron3 = new Ladron("Castaño", "Hockey", "Descapotable Packard 1941", "Femenino", "Jamás se muestra en público sin su collar de rubíes");
    private ArrayList<Ladron> listaLadrones = new ArrayList<Ladron>(){{add(ladron1); add(ladron2);add(ladron3);}};

    private Computadora computadora = new Computadora(listaLadrones);

    @Test
    public void testAlCrearUnaBusquedaDeSospechososCastañosNosDevuelveLosPosiblesLadrones(){
        computadora.cargarPelo("Castaño");

        ArrayList<Ladron> listaSospechosos = computadora.buscarSospechosos();

        assertEquals(listaSospechosos.size(), 2);

    }

    @Test
    public void testSeChequeaOrdenDeArrestoTeniendoUnUnicoSospechosoPosibleEsValida(){

        // Cargamos los datos correspondientes a 'Carmen Sandiego'
        computadora.cargarSexo("Femenino");
        computadora.cargarPelo("Castaño");
        computadora.cargarHobby("Tenis");
        computadora.cargarVehiculo("Descapotable Packard 1939");

        // Debería dar un solo sospechoso y generar la orden de arresto
        ArrayList<Ladron> listaSospechosos = computadora.buscarSospechosos();

        assertEquals(listaSospechosos.size(), 1);

        // La orden de arresto emitida corresponde al ladron buscado
        assertTrue(computadora.chequearOrdenDeArresto(listaLadrones.get(0)));
    }

    @Test
    public void testSeChequeaOrdenDeArrestoTeniendoUnUnicoSospechosoPosibleNoEsValida(){

        // Cargamos los datos correspondientes a 'Carmen Sandiego'
        computadora.cargarSexo("Masculino");
        computadora.cargarPelo("Rubio");
        computadora.cargarHobby("Futbol");
        computadora.cargarVehiculo("Descapotable Packard 1940");

        // Debería dar un solo sospechoso y generar la orden de arresto
        ArrayList<Ladron> listaSospechosos = computadora.buscarSospechosos();

        assertEquals(listaSospechosos.size(), 1);

        // La orden de arresto emitida corresponde al ladron buscado
        assertTrue(computadora.chequearOrdenDeArresto(listaLadrones.get(0)));
    }

    @Test
    public void testSeChequeaOrdenDeArrestoSinTenerEmitidaLaOrdenDeArresto(){

        // Cargamos los datos correspondientes a 'Carmen Sandiego'
        computadora.cargarSexo("Masculino");
        computadora.cargarPelo("Rubio");
        computadora.cargarHobby("Futbol");
        computadora.cargarVehiculo("Descapotable Packard 1940");


        // La orden de arresto emitida no existe
        assert(!(computadora.chequearOrdenDeArresto(listaLadrones.get(0))));
    }

}

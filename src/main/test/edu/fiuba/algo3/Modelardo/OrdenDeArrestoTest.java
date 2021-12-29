package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Controlador.LecturaLadrones;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrdenDeArrestoTest {
    @Test
    public void alTenerUnUnicoSospechosoSeGeneraOrdenDeArrestoYComparamosConElLadronBuscado(){

        ArrayList<Ladron> listaLadrones = LecturaLadrones.leerLadrones();
        Computadora computadora = new Computadora(listaLadrones);

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


}

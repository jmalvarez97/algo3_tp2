package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Controlador.LecturaLadrones;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComputadoraTest {
    @Test
    public void testAlCrearUnaBusquedaDeSospechososCastañosNosDevuelveLosPosiblesLadrones(){
        ArrayList<Ladron> listaLadrones = LecturaLadrones.leerLadrones();
        Computadora computadora = new Computadora(listaLadrones);

        computadora.cargarPelo("Castaño");

        ArrayList<Ladron> listaSospechosos = computadora.buscarSospechosos();

        assertEquals(listaSospechosos.size(), 3);

    }

}

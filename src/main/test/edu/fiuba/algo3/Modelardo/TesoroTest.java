package edu.fiuba.algo3.Modelardo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesoroTest {
    Tesoro tesoro = new Tesoro("Buenos Aires","objeto", "valor");

    @Test
    public void testSeVisitanVariosPaisesConCondicionDeVictoria(){
        for(int i = 0; i<4 ; i++){
            tesoro.sumarPaisCorrecto();
        }

        assertEquals(tesoro.paisesVisitados,4);

        assertEquals(tesoro.cumplePaisesNecesarios(),true);
    }
}

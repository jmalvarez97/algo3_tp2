package edu.fiuba.algo3.Modelardo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CiudadTest {
    Ciudad montreal = new Ciudad("Montreal",37.984167,23.728056,"moneda","geografia","arte","religion","representante","descripcion","color bandera","idioma","caracteristicas","industrias","animales","etnias","otros");

    @Test
    public void testReciboPistaColores(){
        assertEquals(montreal.pistaColores(),"Bienvenido al Aeropuerto Policía. Esta es la información que le puedo dar: color bandera");
    }



}

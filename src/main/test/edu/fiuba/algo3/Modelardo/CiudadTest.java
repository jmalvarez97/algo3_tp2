package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Edificios.Edificio;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CiudadTest {
    Ciudad montreal = new Ciudad("Montreal",37.984167,23.728056,"moneda","geografia","arte","religion","representante","descripcion","color bandera","idioma","caracteristicas","industrias","animales","etnias","otros");

    @Test
    public void testReciboPistaColores(){
        assertEquals(montreal.pistaColores(),"Bienvenido al Aeropuerto Policía. Esta es la información que le puedo dar: color bandera");
    }

    @Test
    public void testReciboPistaMoneda(){
        assertEquals(montreal.pistaMoneda(),"Bienvenido al Banco Policía. Esta es la información que le puedo dar: moneda");
    }

    @Test
    public void testReciboPistaArte(){
        assertEquals(montreal.pistaArte(),"Bienvenido a la Biblioteca Policía. Esta es la información que le puedo dar: arte");
    }

    @Test
    public void testReciboPistaReligion(){
        assertEquals(montreal.pistaReligion(),"Bienvenido a la Biblioteca Policía. Esta es la información que le puedo dar: religion");
    }

    @Test
    public void testReciboPistaRepresentante(){
        assertEquals(montreal.pistaRepresentante(),"Bienvenido al Banco Policía. Esta es la información que le puedo dar: representante");
    }

    @Test
    public void testReciboGeografia(){
        assertEquals(montreal.pistaGeografia(),"Bienvenido al Aeropuerto Policía. Esta es la información que le puedo dar: geografia");
    }

    @Test
    public void testReciboPistaEtnias(){
        assertEquals(montreal.pistaEtnias(),"Bienvenido a la Biblioteca Policía. Esta es la información que le puedo dar: etnias");
    }

    @Test
    public void testReciboPistaIndustria(){
        assertEquals(montreal.pistaIndustria(),"Bienvenido al Banco Policía. Esta es la información que le puedo dar: industrias");
    }

    @Test
    public void testReciboPistaIdiomas(){
        assertEquals(montreal.pistaIdiomas(),"Bienvenido al Aeropuerto Policía. Esta es la información que le puedo dar: idioma");
    }


    @Test
    public void testReciboNombreDeEdificioYDevuelveObjetoBanco(){
        assertEquals(montreal.detectarEdificio("Banco"),montreal.banco);
    }

    @Test
    public void testReciboNombreDeEdificioYDevuelveObjetoBiblioteca(){
        assertEquals(montreal.detectarEdificio("Biblioteca"),montreal.biblioteca);
    }

    @Test
    public void testReciboNombreDeEdificioYDevuelveObjetoAeropuerto(){
        assertEquals(montreal.detectarEdificio("Aeropuerto"), montreal.aeropuerto);
    }
}

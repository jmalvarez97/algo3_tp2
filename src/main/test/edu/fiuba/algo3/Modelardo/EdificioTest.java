package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Edificios.Aeropuerto;
import edu.fiuba.algo3.Modelardo.Edificios.Banco;
import edu.fiuba.algo3.Modelardo.Edificios.Biblioteca;
import edu.fiuba.algo3.Modelardo.Edificios.Edificio;
import edu.fiuba.algo3.Modelardo.Policia.Policia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdificioTest {
    Edificio banco = new Banco(1);
    Edificio aeropuerto = new Aeropuerto(2);
    Edificio biblioteca = new Biblioteca(3);
    private Policia policia = new Policia();


    @Test
    public void testDescuentoHorasAlEntrarPorPrimeraVez(){
        banco.descontarHorasDePolicia(policia);
        assertEquals(policia.horasRestantes(), 154 - 1);
    }

    @Test
    public void testDescuentoHorasAlEntrarPorSegundaVez(){
        aeropuerto.descontarHorasDePolicia(policia);
        assertEquals(policia.horasRestantes(), 154 - 2);
    }

    @Test
    public void testDescuentoHorasAlEntrarPorTerceraVez(){
        biblioteca.descontarHorasDePolicia(policia);
        assertEquals(policia.horasRestantes(), 154 - 3);
    }



}


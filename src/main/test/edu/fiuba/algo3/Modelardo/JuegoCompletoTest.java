package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Controlador.Partida;
import edu.fiuba.algo3.Modelardo.Policia.Policia;
import org.junit.jupiter.api.Test;

public class JuegoCompletoTest {

    @Test
    public void testJuegoCompletoDeUnNovato(){
        Partida partida = new Partida();


        System.out.println("Primeros 4 paises");
        partida.mostrarPaisesAViajar();
        partida.visitarBanco();
        partida.visitarAeropuerto();
        partida.policiaViajaCorrecto();
        partida.mostrarHorasRestantes();


    }
}

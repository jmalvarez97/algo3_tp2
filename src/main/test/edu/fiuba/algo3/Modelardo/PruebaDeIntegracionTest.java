package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Controlador.Partida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaDeIntegracionTest {


    @Test
    public void testJuegoCompletoDondeGanaUnNovato(){
        int horasDia = 8;
        int horasRestantes = 154;
        Partida partida = new Partida();
        // se muestran al usuario las opciones para viajar
        partida.opcionesParaViajar();

        // Visita un banco
        partida.visitar("Banco");
        // visita aeropuerto
        partida.visitar("Aeropuerto");
        horasRestantes -=2;
        horasDia += 2;
        // Se visito 2 edificios, se gasto 2 horas
        assertEquals(partida.horasRestantes(), horasRestantes);

        // Policia viaja correcto a proxima
        double distancia = partida.viajarCorrecto();
        // Le va a Llevar Distancia/VelocidadNovato hacer esto
        int horasASacar = (int) (distancia/900);
        // y si la distancia fue muy grande, tambien el detective procede a dormir
        // por lo tanto se le descuentan las horas
        horasDia+=horasASacar;
        if (horasDia > 23){
            horasRestantes-=8;
            horasDia = horasDia -24 + 8;
        }
        horasRestantes -= horasASacar;
        assertEquals(partida.horasRestantes(), horasRestantes);


        //Chequeo la hora para ver si corresponde saber si durmio ????





        // Segundo pais, se muestran los siguientes paises de donde pudo haber ido el ladron
        partida.opcionesParaViajar();

        // Visita un banco
        partida.visitar("Banco");
        // visita aeropuerto
        partida.visitar("Biblioteca");

        // se le restan las 2 horas
        horasRestantes -= 2;
        assertEquals(partida.horasRestantes(), horasRestantes);

        // Policia viaja correcto a proxima
        distancia = partida.viajarCorrecto();
        // Le va a Llevar Distancia/VelocidadNovato hacer esto
        horasASacar = (int) (distancia/900);
        // y si la distancia fue muy grande, tambien el detective procede a dormir
        // por lo tanto se le descuentan las horas
        horasDia+=horasASacar;

        if (horasDia > 23){
            horasRestantes-=8;
            horasDia = horasDia -24 + 8;
        }
        horasRestantes -= horasASacar;
        assertEquals(partida.horasRestantes(), horasRestantes);

        // aca el usuario emite la orden de arresto correcta
        partida.emitirOrdenCorrecta();
        horasRestantes-= 3;
        assertEquals(partida.horasRestantes(), horasRestantes );




    }
}

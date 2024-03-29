package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Controlador.Partida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegracionTest {


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

        // Le va a Llevar Distancia/VelocidadNovato hacer esto. Distancias muy cortas llevan 1 hora
        int horasASacar = (int) (distancia)/900;
        if (horasASacar==0)
            horasASacar+=1;

        // y si la distancia fue muy grande, tambien el detective procede a dormir
        // por lo tanto se le descuentan las horas
        horasDia+=horasASacar;
        if (horasDia > 23){
            horasRestantes-=8;
            horasDia = horasDia -24 + 8;
        }
        horasRestantes -= horasASacar;
        assertEquals(partida.horasRestantes(), horasRestantes);

        // Chequeamos si gano el usuario: No entra, ya que no cumple los paises
        if (partida.cumplePaisesNecesarios())
            assertTrue(partida.ganoUsuario());






        // Segundo pais, se muestran los siguientes paises de donde pudo haber ido el ladron
        partida.opcionesParaViajar();

        assertEquals(partida.horasRestantes(), horasRestantes);

        // visita aeropuerto
        partida.visitar("Aeropuerto");

        // se le resta 1 hora
        horasRestantes -= 1;
        horasDia+=1;

        if (horasDia > 23){
            horasRestantes-=8;
            horasDia = horasDia -24 + 8;
        }
        assertEquals(partida.horasRestantes(), horasRestantes);

        // Policia viaja correcto a proxima
        distancia = partida.viajarCorrecto();
        // Le va a Llevar Distancia/VelocidadNovato hacer esto. Distancias muy cortas llevan 1 hora
        horasASacar = (int) (distancia) / 900;
        if (horasASacar==0)
            horasASacar+=1;

        // y si la distancia fue muy grande, tambien el detective procede a dormir
        // por lo tanto se le descuentan las horas
        horasDia += horasASacar;

        if (horasDia > 23) {
            horasRestantes -= 8;
            horasDia = horasDia - 24 + 8;
        }
        horasRestantes -= horasASacar;
        assertEquals(partida.horasRestantes(), horasRestantes);

        // aca el usuario emite la orden de arresto correcta
        partida.emitirOrdenCorrecta();
        horasRestantes -= 3;
        horasDia+=3;

        if (horasDia > 23) {
            horasRestantes -= 8;
            horasDia = horasDia - 24 + 8;
        }
        assertEquals(partida.horasRestantes(), horasRestantes);

        // Chequeamos si gano el usuario . No entra, ya que no cumple los paises
        if (partida.cumplePaisesNecesarios())
            assertTrue(partida.ganoUsuario());




        // tercer pais, se muestran los siguientes paises de donde pudo haber ido el ladron
        partida.opcionesParaViajar();

        // Visita una Biblioteca
        partida.visitar("Biblioteca");

        // se le resta 1 hora
        horasRestantes -= 1;
        horasDia+=1;

        // aca hieren con cuchillo al policia , por ser primera vez, se le quita dos horas
        if(partida.herirConCuchillo()){
            horasRestantes -=2;
            horasDia+=2;
        }


        if (horasDia > 23){
            horasRestantes-=8;
            horasDia = horasDia -24 + 8;
        }
        assertEquals(partida.horasRestantes(), horasRestantes);


        // visita aeropuerto
        partida.visitar("Aeropuerto");

        // se le resta 1 hora
        horasRestantes -= 1;
        horasDia+=1;

        if (horasDia > 23){
            horasRestantes-=8;
            horasDia = horasDia -24 + 8;
        }
        assertEquals(partida.horasRestantes(), horasRestantes);

        // Policia viaja correcto a proxima
        distancia = partida.viajarCorrecto();
        // Le va a Llevar Distancia/VelocidadNovato hacer esto. Distancias muy cortas llevan 1 hora
        horasASacar = (int) (distancia) / 900;
        if (horasASacar==0)
            horasASacar+=1;

        // y si la distancia fue muy grande, tambien el detective procede a dormir
        // por lo tanto se le descuentan las horas
        horasDia += horasASacar;

        if (horasDia > 23) {
            horasRestantes -= 8;
            horasDia = horasDia - 24 + 8;
        }
        horasRestantes -= horasASacar;
        assertEquals(partida.horasRestantes(), horasRestantes);

        // Chequeamos si gano el usuario
        if (partida.cumplePaisesNecesarios())
            assertTrue(partida.ganoUsuario());
    }
















}

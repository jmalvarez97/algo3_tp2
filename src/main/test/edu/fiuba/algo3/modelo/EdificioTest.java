package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdificioTest {

    @Test
    public void testCreoUnBancoYMeDaLaMonedaDelPaisProximo(){
        Edificio banco = new Banco();
        Ciudad ciudadProxima = new Ciudad("roja blanca y azul","euros", "torre eiffel");

        String pista = banco.darPista(ciudadProxima);
        assert(pista.contains("euros"));
    }

    @Test
    public void testCreoUnAeropuertoYMeDaLosColoresDelPaisProximo(){
        Edificio aeropuerto = new Aeropuerto();
        Ciudad ciudadProxima = new Ciudad("roja blanca y azul","euros", "torre eiffel");

        String pista = aeropuerto.darPista(ciudadProxima);
        assert(pista.contains("roja blanca y azul"));
    }

    @Test
    public void testCreoUnaBibliotecaYMeDaLaPistaRandomDePaisProximo(){
        Edificio biblioteca = new Biblioteca();
        Ciudad ciudadProxima = new Ciudad("roja blanca y azul","euros", "la torre eiffel");

        String pista = biblioteca.darPista(ciudadProxima);
        assert(pista.contains("la torre eiffel"));
    }
}

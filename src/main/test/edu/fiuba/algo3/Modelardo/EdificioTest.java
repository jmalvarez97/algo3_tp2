package edu.fiuba.algo3.Modelardo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdificioTest {

    @Test
    public void testCreoUnBancoYMeDaLaMonedaDelPaisProximo(){
        Edificio banco = new Banco();
        Ciudad ciudadProxima = new Ciudad("Montreal",37.984167,23.728056,"euros",null,null,null,null,null,null,null,null,null,null,null,null);

        String pista = banco.darPista(ciudadProxima);
        assert(pista.contains("euros"));
    }

    @Test
    public void testCreoUnAeropuertoYMeDaLosColoresDelPaisProximo(){
        ArrayList<String> colores = new ArrayList<String>(){{add("rojo"); add("blanco");}};
        Edificio aeropuerto = new Aeropuerto();
        Ciudad ciudadProxima = new Ciudad("Montreal",37.984167,23.728056,null,null,null,null,null,null,colores,null,null,null,null,null,null);

        String pista = aeropuerto.darPista(ciudadProxima);
        assert(pista.contains("rojo"));
    }

    @Test
    public void testCreoUnaBibliotecaYMeDaLaPistaRandomDePaisProximo(){
        Edificio biblioteca = new Biblioteca();
        Ciudad ciudadProxima = new Ciudad("Montreal",37.984167,23.728056,null,null,"la torre eiffel",null,null,null,null,null,null,null,null,null,null);

        String pista = biblioteca.darPista(ciudadProxima);
        assert(pista.contains("la torre eiffel"));
    }
}

package edu.fiuba.algo3.Modelardo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.fiuba.algo3.Modelardo.Edificios.Aeropuerto;
import edu.fiuba.algo3.Modelardo.Edificios.Biblioteca;
import edu.fiuba.algo3.Modelardo.Edificios.Banco;
import edu.fiuba.algo3.Modelardo.Edificios.Edificio;
import edu.fiuba.algo3.Modelardo.Pistas.Pista;
import edu.fiuba.algo3.Modelardo.Pistas.PistaFacil;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PistaFacilTest {
    Edificio banco = new Banco();
    Edificio aeropuerto = new Aeropuerto();
    Edificio biblioteca = new Biblioteca();
    Pista pistaFacil = new PistaFacil();
    Ciudad montreal = new Ciudad("Montreal",37.984167,23.728056,"moneda","geografia","arte","religion","representante","descripcion","color bandera","idioma","caracteristicas","industrias","animales","etnias","otros");

    @Test
    public void TestBancoDaPistaFacil(){
        assertEquals(banco.darPista(pistaFacil, montreal),"Bienvenido al Banco Policía. Esta es la información que le puedo dar: moneda");
    }

    @Test
    public void TestBibliotecaDaPistaFacil(){
        assertEquals(biblioteca.darPista(pistaFacil, montreal),"Bienvenido a la Biblioteca Policía. Esta es la información que le puedo dar: arte");
    }

    @Test
    public void TestAeropuertoDaPistaFacil(){
        assertEquals(aeropuerto.darPista(pistaFacil, montreal),"Bienvenido al Aeropuerto Policía. Esta es la información que le puedo dar: color bandera");
    }

}

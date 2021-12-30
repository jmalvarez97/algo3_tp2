package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Edificios.Aeropuerto;
import edu.fiuba.algo3.Modelardo.Edificios.Biblioteca;
import edu.fiuba.algo3.Modelardo.Edificios.Banco;
import edu.fiuba.algo3.Modelardo.Edificios.Edificio;
import edu.fiuba.algo3.Modelardo.Pistas.Pista;
import edu.fiuba.algo3.Modelardo.Pistas.PistaDificil;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PistaDificilTest {
    Edificio banco = new Banco();
    Edificio aeropuerto = new Aeropuerto();
    Edificio biblioteca = new Biblioteca();
    Pista pistaDificil = new PistaDificil();
    Ciudad montreal = new Ciudad("Montreal",37.984167,23.728056,"moneda","geografia","arte","religion","representante","descripcion","color bandera","idioma","caracteristicas","industrias","animales","etnias","otros");

    @Test
    public void TestBancoDaPistaDificil(){
        assertEquals(banco.darPista(pistaDificil, montreal),"Bienvenido al Banco Policía. Esta es la información que le puedo dar: representante");
    }

    @Test
    public void TestBibliotecaDaPistaDificil(){
        assertEquals(biblioteca.darPista(pistaDificil, montreal),"Bienvenido a la Biblioteca Policía. Esta es la información que le puedo dar: religion");
    }

    @Test
    public void TestAeropuertoDaPistaDificil(){
        assertEquals(aeropuerto.darPista(pistaDificil, montreal),"Bienvenido al Aeropuerto Policía. Esta es la información que le puedo dar: geografia");
    }

}

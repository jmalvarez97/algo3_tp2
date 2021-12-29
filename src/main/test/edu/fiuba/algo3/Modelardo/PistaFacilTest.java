package edu.fiuba.algo3.Modelardo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PistaFacilTest {
    Edificio banco = new Banco();
    PistaFacil pista = new PistaFacil(banco, "Compró moneda ");

    @Test
    public void testBancoDaPista (){
        String dato = "dolar";
        assertEquals(pista.darPista(dato),"Compró moneda dolar");
    }
}

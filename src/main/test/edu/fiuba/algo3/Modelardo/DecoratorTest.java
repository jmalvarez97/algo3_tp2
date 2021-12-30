package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Controlador.LecturaLadrones;
import edu.fiuba.algo3.Modelardo.Decorator.*;
import edu.fiuba.algo3.Modelardo.Decorator.Ladron;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    public void testCreoDosLadronesYVeoSuLogicaDeComparacion() {

        Ladron ladron = new Ladron("Rubio", "Tenis","Convertible","Masculino","Tatuaje");

        Ladron ladronSemiVacio = new Ladron();
        ColorDePelo pelo = new ColorDePelo(ladronSemiVacio, "Rubio");
        Hobby ladronConPeloRubioYJuegaTenis = new Hobby(pelo,"Tenis");


        boolean a = ladronConPeloRubioYJuegaTenis.comparar(ladron);

        assertTrue(a);
    }


    @Test
    public void testCreoDosLadronesIdenticosYComparo(){
        Ladron ladron = new Ladron("Rubio", "Tenis","Convertible","Masculino","Tatuaje");

        Ladron ladronALlenar = new Ladron();
        ColorDePelo pelo = new ColorDePelo(ladronALlenar,"Rubio");
        Hobby hobby = new Hobby(pelo, "Tenis");
        Vehiculo vehiculo = new Vehiculo(hobby, "Convertible");
        Sexo sexo = new Sexo(vehiculo, "Masculino");
        Senia ladronALLenarCompleto = new Senia(sexo, "Tatuaje");

        assertTrue(ladronALLenarCompleto.comparar(ladron));

    }

    @Test
    public void testCreoDosLadronesDistintos(){
        Ladron ladron = new Ladron("Rubio", "Tenis","Convertible","Masculino","Tatuaje");

        Ladron ladronALlenar = new Ladron();
        ColorDePelo pelo = new ColorDePelo(ladronALlenar,"Rubio");
        Hobby hobby = new Hobby(pelo, "Alpinismo");
        Vehiculo ladronALlenarSemiCompleto = new Vehiculo(hobby, "Moto");


        assertFalse(ladronALlenarSemiCompleto.comparar(ladron));

    }

    @Test
    public void testCreoDosLadronesTotalmenteDistintos(){
        Ladron ladron = new Ladron("Rubio", "Tenis","Convertible","Masculino","Tatuaje");

        Ladron ladronALlenar = new Ladron();
        ColorDePelo pelo = new ColorDePelo(ladronALlenar,"Castaño");
        Hobby hobby = new Hobby(pelo, "Alpinismo");
        Vehiculo vehiculo = new Vehiculo(hobby, "Moto");
        Sexo sexo = new Sexo(vehiculo, "Femenino");
        Senia ladronALLenarCompleto = new Senia(sexo, "otraCosa");

        assertFalse(ladronALLenarCompleto.comparar(ladron));


    }
    @Test
    public void testIteroUnaListaDeLadronesYVeoLosResultadosCorrectos(){
        ArrayList<Ladron> listaLadrones = LecturaLadrones.leerLadrones();
        int castaños = 0;

        Ladron ladronALlenar = new Ladron();
        ColorDePelo ladronesCastaños = new ColorDePelo(ladronALlenar, "Castaño");

        for(int i = 0; i < listaLadrones.size(); i++) {
            if (ladronesCastaños.comparar(listaLadrones.get(i))) {
                castaños += 1;
            }
        }

        assertEquals(castaños,3);


    }

}




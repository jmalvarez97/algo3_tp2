package edu.fiuba.algo3.Modelardo;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MapaTest {
    Ciudad atenas = new Ciudad("Atenas",37.984167,23.728056,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Ciudad baghdad = new Ciudad ("Baghdad",33.35,44.416667,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Ciudad buenosaires = new Ciudad ("Buenos Aires", -34.599722,-58.381944,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Ciudad paris = new Ciudad ("Paris",33.35,44.416667,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Ciudad montreal = new Ciudad("Montreal",37.984167,23.728056,null,null,null,null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad mexico = new Ciudad ("Mexico",33.35,44.416667,"pesos",null,"civilizacion azteca",null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad bamako = new Ciudad ("bamako",33.35,44.416667,"pesos",null,"civilizacion azteca",null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad londres = new Ciudad ("londres",33.35,44.416667,"pesos",null,"civilizacion azteca",null,null,null,"blanco",null,null,null,null,null,null);
    Ciudad moscu = new Ciudad("Montreal",37.984167,23.728056,null,null,null,null,null,null,"blanco",null,null,null,null,null,null);





    public Mapa creoMapa (){
        ArrayList<Ciudad> listaCiudades= new ArrayList<Ciudad>();
        listaCiudades.add (atenas);
        listaCiudades.add (baghdad);
        listaCiudades.add (buenosaires);
        listaCiudades.add(paris);
        listaCiudades.add(montreal);
        listaCiudades.add(mexico);
        listaCiudades.add(bamako);
        listaCiudades.add(londres);
        listaCiudades.add(moscu);

        Mapa mapa = new Mapa (atenas,baghdad,listaCiudades);
        return mapa;
    }


    @Test
    public void testCalculoDistanciaEntreDosCiudades(){
        Mapa mapa=creoMapa();
        double distancia = mapa.distanciaA(buenosaires);
        assertEquals((int)distancia, 12164);
    }

    @Test
    public void testCreoArrayDeOpcionesParaViajar(){
        Mapa mapa= creoMapa();
        ArrayList<Ciudad> listaOpciones = mapa.opcionesParaViajar();
        //Me fijo que sean 3 ciudades
        assertEquals(listaOpciones.size(),3);
        //Me fijo que este la ciudad proxima
        assertTrue(listaOpciones.contains(baghdad));
    }

    @Test
    public void testViajaACiudadCorrecta(){
        Mapa mapa = creoMapa();
        Tesoro tesoro = new Tesoro("Buenos Aires","Sombrero de Gardel", "Comun");
        mapa.viajar(baghdad,tesoro);
        assertEquals(mapa.ciudadActual(),baghdad);
        assertTrue(mapa.ciudadProxima() != baghdad);

    }
}


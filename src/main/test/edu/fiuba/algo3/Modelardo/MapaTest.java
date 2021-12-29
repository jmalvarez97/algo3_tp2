package edu.fiuba.algo3.Modelardo;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MapaTest {
    Ciudad atenas = new Ciudad("Atenas",37.984167,23.728056,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Ciudad baghdad = new Ciudad ("Baghdad",33.35,44.416667,null,null,null,null,null,null,null,null,null,null,null,null,null);
    Ciudad buenosaires = new Ciudad ("Buenos Aires", -34.599722,-58.381944,null,null,null,null,null,null,null,null,null,null,null,null,null);

    public Mapa creoMapa (){
        ArrayList<Ciudad> listaCiudades= new ArrayList<Ciudad>();
        listaCiudades.add (atenas);
        listaCiudades.add (baghdad);
        listaCiudades.add (buenosaires);
        Mapa mapa = new Mapa (atenas,baghdad,listaCiudades);
        return mapa;
    }


    @Test
    public void testCalculoDistanciaEntreDosCiudades(){
        Mapa mapa=creoMapa();
        double distancia = mapa.distanciaA(buenosaires);
        assertEquals((int)distancia, 12164);
    }



}

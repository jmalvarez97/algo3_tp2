package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Decorator.Ladron;
import edu.fiuba.algo3.Modelardo.Policia.Policia;

import java.util.ArrayList;
import java.util.*;
import java.util.Objects;

public class Mapa {

    // Factor de proporcionalidad para pasar de coordenadas a kms
    private final int CONSTANTE_KMS = 111; // 2 * pi * radioTierra / 360

    private Ciudad actual;
    private Ciudad proxima;
    private ArrayList<Ciudad> listaCiudades;


    public Mapa(Ciudad actual, Ciudad proxima, ArrayList<Ciudad> listaCiudades){
        this.actual = actual;
        this.proxima = proxima;
        this.listaCiudades = listaCiudades;
    }

    public String visitar(String unEdificio, Policia policia, Ladron ladron){
        return actual.visitar(proxima, unEdificio, policia,ladron );
    }

    // Devuelve la distancia, con eso delegarle a policia que calcule sus horas por restar
    public double viajar(Ciudad destino, Tesoro tesoro){
        // Hacer la cuenta de horas y distancia y restar horas
        double distanciaViaje = distanciaA(destino);

        int indexActual = this.listaCiudades.indexOf(this.actual);
        int indexDestino = this.listaCiudades.indexOf(destino);

        actual = destino;
        // Si se viaja a la ciudad correcta, se actualiza proxima
        if(Objects.equals(destino.getNombre(), proxima.getNombre())) {
            //Tomamos una ciudad random de la lista de ciudades para que sea la ciudad próxima
            int randomIndex=indexActual;

            while (randomIndex==indexActual || randomIndex==indexDestino){
                randomIndex = (int) (Math.random()*10 - 1);
            }
            proxima  = this.listaCiudades.get(randomIndex);
            // Se acierta en uno de los paises de la estrategia del ladron --> se suma 1 (le doy la resp a tesoro)
            tesoro.sumarPaisCorrecto();

        }
        // Si el viaje fue incorrecto, no se actualiza proxima pero puedo conseguir pistas para ir a la correcta
        return distanciaViaje;
    }

    public double distanciaA(Ciudad destino) {
        // hipotenusa del triangulo con catetos distancia en longitud y en latitud
        double dLongitud = Math.abs(actual.getLongitud() - destino.getLongitud());
        double dLatitud = Math.abs(actual.getLatitud() - destino.getLatitud());
        double distancia = Math.sqrt(Math.pow(dLongitud,2) + Math.pow(dLatitud,2));
        return distancia * this.CONSTANTE_KMS;
    }

    public ArrayList<Ciudad> opcionesParaViajar(){
        // Devuelve actual, proxima + 2 ciudades random
        ArrayList<Ciudad> listaOpciones = new ArrayList<Ciudad>();


        listaOpciones.add(this.proxima);
        int indexProxima = this.listaCiudades.indexOf(this.proxima);
        int indexActual = this.listaCiudades.indexOf(this.actual);

        int randomIndex1=indexProxima;
        while (randomIndex1 == indexProxima || randomIndex1==indexActual){
            randomIndex1 = (int) (Math.random()*10 - 1);
        }
        Ciudad random1 = this.listaCiudades.get(randomIndex1);

        int randomIndex2=randomIndex1;
        while (randomIndex1 == randomIndex2 || randomIndex2==indexProxima || randomIndex2==indexActual){
            randomIndex2 = (int) (Math.random()*10 - 1);
        }
        Ciudad random2 = this.listaCiudades.get(randomIndex2);


        listaOpciones.add(random1);
        listaOpciones.add(random2);


        Collections.shuffle(listaOpciones);
        return listaOpciones;
    }

    public Ciudad ciudadActual(){
        return this.actual;
    }

    public  Ciudad ciudadProxima() {return this.proxima;}

    public double viajarCorrecto(Tesoro tesoro) {
        return viajar(proxima, tesoro);

    }
}

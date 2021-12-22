package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.*;

import java.util.ArrayList;

public class Partida{

    private Caso caso;
    private Policia policia;

    //Como atributo tendra a las bases de datos
    ArrayList<Ciudad> listaCiudades;
    ArrayList<Ladron> listaLadrones;
    ArrayList<Tesoro> listaTesoros;

    public Partida(){
        this.listaCiudades = LecturaCiudades.leerCiudades();
        this.listaLadrones = LecturaLadrones.leerLadrones();
        this.listaTesoros = LecturaTesoros.leerTesoros();

        this.policia = new Policia();
        nuevoCaso();
    }

    public void nuevoCaso(){

        //Tomamos un ladron random de la lista de ladrones y le asignamos el robo
        int randomIndex = (int) (Math.random() - 1);
        Ladron ladronDelCaso = this.listaLadrones.get(randomIndex);

        //Tomamos un tesoro de valor acorde a la cantidad de arrestos del policia
        String valorTesoroRobado = (this.policia).devolverValorTesoro();
        Tesoro tesoroDelCaso = LecturaTesoros.devuelveTesoroDeValor( valorTesoroRobado, this.listaTesoros);

        //Tomamos una ciudad random de la lista de ciudades para que sea la ciudad inicial
        randomIndex = (int) (Math.random() - 1);
        Ciudad ciudadInicial  = this.listaCiudades.get(randomIndex);

        //Tomamos una ciudad random de la lista de ciudades para que sea la ciudad próxima
        randomIndex = (int) (Math.random() - 1);
        Ciudad ciudadProxima  = this.listaCiudades.get(randomIndex);

        //Creamos un mapa
        Mapa unMapa = new Mapa(ciudadInicial, ciudadProxima);

        //Creamos un caso
        this.caso = new Caso(this.policia, tesoroDelCaso, ladronDelCaso, unMapa);
    }

}

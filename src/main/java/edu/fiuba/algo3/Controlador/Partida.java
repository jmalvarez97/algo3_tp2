package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.*;
import edu.fiuba.algo3.Modelardo.Policia.Policia;

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

        this.policia = new Policia(listaLadrones);
        nuevoCaso();
    }

    public void nuevoCaso(){

        //Tomamos un ladron random de la lista de ladrones y le asignamos el robo
        int randomIndex = (int) (Math.random()*10 );
        Ladron ladronDelCaso = this.listaLadrones.get(randomIndex);

        //Tomamos un tesoro de valor acorde a la cantidad de arrestos del policia
        Tesoro tesoroDelCaso = (this.policia).devolverTesoroAcorde(this.listaTesoros);

        //Tomamos una ciudad random de la lista de ciudades para que sea la ciudad inicial
        randomIndex = (int) (Math.random()*10);
        Ciudad ciudadInicial  = this.listaCiudades.get(randomIndex);

        //Tomamos una ciudad random de la lista de ciudades para que sea la ciudad próxima
        randomIndex = (int) (Math.random()*10);
        Ciudad ciudadProxima  = this.listaCiudades.get(randomIndex);

        //Creamos un mapa
        Mapa unMapa = new Mapa(ciudadInicial, ciudadProxima, listaCiudades);

        //Creamos un caso
        this.caso = new Caso(this.policia, tesoroDelCaso, ladronDelCaso, unMapa);
    }

    public void mostrarPaisesAViajar() {
        (this.caso).mostrarPaises();
    }

    public void mostrarEdificios() {
        this.caso.mostrarEdificios();
    }

    public void policiaViajaCorrecto() {
        double kms = this.caso.viajarCorrecto();
        System.out.println("Kms Recorridos: " + kms);
        this.policia.descontarHorasDeViaje(kms);
    }

    public void visitarBanco() {
        System.out.println("Pista Bancaria: " + this.caso.visitar("banco"));
    }

    public void visitarAeropuerto(){
        System.out.println("Pista Aeropuerto: " +this.caso.visitar("aeropuerto"));
    }

    public void mostrarHorasRestantes() {
        System.out.println("Horas Restantes : " +this.policia.horasRestantes());
    }
}

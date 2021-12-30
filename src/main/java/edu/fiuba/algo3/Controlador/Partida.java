package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.*;
import edu.fiuba.algo3.Modelardo.Decorator.Ladron;
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

        this.policia = new Policia();
        nuevoCaso();
    }

    public void nuevoCaso(){

        //Tomamos un ladron random de la lista de ladrones y le asignamos el robo
        int randomIndex = (int) (Math.random() * 10);
        Ladron ladronDelCaso = this.listaLadrones.get(randomIndex);

        //Tomamos un tesoro de valor acorde a la cantidad de arrestos del policia
        Tesoro tesoroDelCaso = (this.policia).devolverTesoroAcorde(this.listaTesoros);

        //Tomamos una ciudad random de la lista de ciudades para que sea la ciudad inicial
        int randomIndex1 = (int) ((Math.random()*10) - 1);
        Ciudad ciudadInicial  = this.listaCiudades.get(randomIndex1);

        //Tomamos una ciudad random de la lista de ciudades para que sea la ciudad próxima
        int randomIndex2=randomIndex1;
        while (randomIndex2==randomIndex1){
            randomIndex2 = (int) (Math.random()*10 - 1);
        }
        Ciudad ciudadProxima  = this.listaCiudades.get(randomIndex2);

        //Creamos un mapa
        Mapa unMapa = new Mapa(ciudadInicial, ciudadProxima, listaCiudades);

        //Creamos la computadora
        Computadora computadora = new Computadora(listaLadrones);

        //Creamos un caso
        this.caso = new Caso(this.policia, tesoroDelCaso, ladronDelCaso, unMapa, computadora);
    }

    public String nombreCompletoTesoro() {
        return (this.caso).nombreCompletoTesoro();
    }

    public Ciudad ciudadActual () {return (this.caso).ciudadActual();}

    public ArrayList<Ciudad> opcionesParaViajar(){return (this.caso).opcionesParaViajar();}

    public void viajar (Ciudad proxima){(this.caso).viajar(proxima);}

    public String visitar(String nombreEdificio){return (this.caso).visitar(nombreEdificio);}

    public double viajarCorrecto() {
        return this.caso.viajarCorrecto();
    }

    public int horasRestantes() {
        return this.policia.horasRestantes();
    }

    public void emitirOrdenCorrecta() {
        this.caso.emitirOrdenCorrecta();
    }

    public boolean ganoUsuario() {
        return this.caso.chequearOrdenDeArresto() && this.caso.cumplePaisesNecesarios();
    }
}

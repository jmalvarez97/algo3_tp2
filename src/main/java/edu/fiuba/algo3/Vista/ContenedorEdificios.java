package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.BotonEdificioEventHandler;
import edu.fiuba.algo3.Controlador.BotonVolverEventHandler;
import edu.fiuba.algo3.Controlador.Partida;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ContenedorEdificios extends HBox {

    private Stage stage;
    private Partida partida;
    private Scene escenaAnterior;

    public ContenedorEdificios(Stage stage, Partida partida,Scene escenaAnterior){
        this.stage = stage;
        this.partida = partida;
        this.escenaAnterior = escenaAnterior;

        Scene escenaEdificios = new Scene(this,640,480);

        //BOTON BANCO
        Button botonBanco = new Button();
        botonBanco.setText("Banco");
        BotonEdificioEventHandler botonBancoEventHandler = new BotonEdificioEventHandler(stage,partida,botonBanco,escenaEdificios);
        botonBanco.setOnAction(botonBancoEventHandler);

        //BOTON AEROPUERTO
        Button botonAeropuerto = new Button();
        botonAeropuerto.setText("Aeropuerto");
        BotonEdificioEventHandler botonAeropuertoEventHandler = new BotonEdificioEventHandler(stage,partida,botonAeropuerto,escenaEdificios);
        botonAeropuerto.setOnAction(botonAeropuertoEventHandler);

        //BOTON BIBLIOTECA
        Button botonBiblioteca = new Button();
        botonBiblioteca.setText("Biblioteca");
        BotonEdificioEventHandler botonBibliotecaEventHandler = new BotonEdificioEventHandler(stage,partida,botonBiblioteca,escenaEdificios);
        botonBiblioteca.setOnAction(botonBibliotecaEventHandler);

        //BOTON VOLVER
        Button botonVolver = new Button();
        botonVolver.setText("Volver");
        BotonVolverEventHandler botonVolverEventHandler = new BotonVolverEventHandler(stage,escenaAnterior);
        botonVolver.setOnAction(botonVolverEventHandler);
    }
}

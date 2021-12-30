package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.BotonEdificioGeneralEventHandler;
import edu.fiuba.algo3.Controlador.Partida;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ContenedorEdificios extends HBox {

    private Stage stage;
    private Partida partida;
    private Scene escenaElegirEdificio;

    public ContenedorEdificios(Stage stage, Partida partida,Scene escenaElegirEdificio){
        this.stage = stage;
        this.partida = partida;
        this.escenaElegirEdificio = escenaElegirEdificio;

        //BOTON BANCO
        Button botonBanco = new Button();
        botonBanco.setText("Banco");
        BotonEdificioGeneralEventHandler botonBancoEventHandler = new BotonEdificioGeneralEventHandler(stage,partida,botonBanco,escenaElegirEdificio);
        botonBanco.setOnAction(botonBancoEventHandler);

        //BOTON AEROPUERTO
        Button botonAeropuerto = new Button();
        botonAeropuerto.setText("Aeropuerto");
        BotonEdificioGeneralEventHandler botonAeropuertoEventHandler = new BotonEdificioGeneralEventHandler(stage,partida,botonAeropuerto,escenaElegirEdificio);
        botonAeropuerto.setOnAction(botonAeropuertoEventHandler);

        //BOTON BIBLIOTECA
        Button botonBiblioteca = new Button();
        botonBiblioteca.setText("Biblioteca");
        BotonEdificioGeneralEventHandler botonBibliotecaEventHandler = new BotonEdificioGeneralEventHandler(stage,partida,botonBiblioteca,escenaElegirEdificio);
        botonBiblioteca.setOnAction(botonBibliotecaEventHandler);

        this.getChildren().addAll(botonBanco,botonAeropuerto,botonBiblioteca);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
    }
}

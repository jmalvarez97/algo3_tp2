package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BotonEdificiosEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Scene escenaCiudad;
    private Partida partida;

    public BotonEdificiosEventHandler(Stage stage,Scene escenaCiudad,Partida partida){

        this.stage = stage;
        this.escenaCiudad = escenaCiudad;
        this.partida = partida;

    }

    @Override
    public void handle(ActionEvent actionEvent) {

        Label label = new Label("A qué edificio querés entrar?");

        Button botonBanco = new Button();
        botonBanco.setText("Banco");
        BotonBancoEventHandler botonBancoEventHandler = new BotonBancoEventHandler(stage,partida,botonBanco);
        botonBanco.setOnAction(botonBancoEventHandler);

        Button botonAeropuerto = new Button();
        botonAeropuerto.setText("Aeropuerto");
        //BotonAeropuertoEventHandler botonAeropuertoEventHandler = new BotonAeropuertoEventHandler();
        //botonAeropuerto.setOnAction(botonAeropuertoEventHandler);

        Button botonBiblioteca = new Button();
        botonBiblioteca.setText("Biblioteca");
        //BotonBibliotecaEventHandler botonBibliotecaEventHandler = new BotonBibliotecaEventHandler();
        //botonBiblioteca.setOnAction(botonBibliotecaEventHandler);

        Button botonVolver = new Button();
        botonVolver.setText("Volver");
        BotonVolverEventHandler botonVolverEventHandler = new BotonVolverEventHandler(stage,escenaCiudad);
        botonVolver.setOnAction(botonVolverEventHandler);

        HBox contenedorEdificios = new HBox();
        contenedorEdificios.getChildren().addAll(botonBanco,botonAeropuerto,botonBiblioteca);
        contenedorEdificios.setSpacing(20);
        contenedorEdificios.setAlignment(Pos.CENTER);

        VBox contenedor = new VBox();
        contenedor.getChildren().addAll(label,contenedorEdificios,botonVolver);
        contenedor.setSpacing(150);
        contenedor.setAlignment(Pos.CENTER);

        Scene escenaNueva = new Scene(contenedor,640,480);
        stage.setScene(escenaNueva);
    }
}

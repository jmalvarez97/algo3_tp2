package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        stage.setTitle("Dónde $@#! está Carmen Sandiego?");

        Label labelNombreJuego = new Label("Where in the World is Carmen Sandiego? // Grupo 4");
        Label labelVersion = new Label("running on Java " + javaVersion + ".");

        HBox layoutHB = new HBox();
        Label labelNombreJugador = new Label("Nombre del jugador: ");
        TextField nombreJugadorTF = new TextField();
        nombreJugadorTF.setPromptText("Ingrese su nombre");
        layoutHB.getChildren().add(labelNombreJugador);
        layoutHB.getChildren().add(nombreJugadorTF);

        Button botonEnviar = new Button("Enviar");
        Label etiqueta = new Label();

        BotonEnviarEventHandler botonEnviarEventHandler = new BotonEnviarEventHandler(nombreJugadorTF,etiqueta);
        botonEnviar.setOnAction(botonEnviarEventHandler);


        TextoEventHandler textoEventHandler = new TextoEventHandler(botonEnviar);
        nombreJugadorTF.setOnKeyPressed(textoEventHandler);

        VBox layout = new VBox(labelNombreJuego, labelVersion);
        layout.getChildren().add(layoutHB);
        layout.getChildren().add(botonEnviar);
        layout.getChildren().add(etiqueta);
        layout.setSpacing(15);
        layout.setPadding(new Insets(20));



        var scene = new Scene(layout, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
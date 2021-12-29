package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.ContenedorInicio;
import edu.fiuba.algo3.Vista.SystemInfo;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        stage.setTitle("Dónde $@#! está Carmen Sandiego?");

        /*
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
         */

        Partida partida = new Partida();

        ContenedorInicio contenedorInicio = new ContenedorInicio(partida, stage);

        var scene = new Scene(contenedorInicio, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Partida partida = new Partida();
        launch();
        //Primer Pantalla:
        //Mensaje introductorio al juego. Mencionar que tesoro fue robado y su valor.
        //Mencionar el sexo del sospechoso. "Toque cualquier tecla para continuar"

        //Segunda Pantalla (se itera de ciudad a ciudad):
        //Opcion 1: Usar la computadora y cargar datos/ver sospechosos
        //Opcion 2: Viajar/elegir pais proximo
        //Opcion 3: Entrar a algun edificio
        //Tercera Pantalla:
        //Pop up Opcion 2: Ingresar a algun edifico
        //Al elegir un edificio -> dar una pista relacionada al edificio
    }

}
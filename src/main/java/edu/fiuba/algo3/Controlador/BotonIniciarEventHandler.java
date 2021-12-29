package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.Tesoro;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BotonIniciarEventHandler implements EventHandler<ActionEvent> {

    Stage stage;
    Partida partida;

    public BotonIniciarEventHandler(Stage stage, Partida partida){
        this.stage = stage;
        this.partida = partida;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        Label instruccion = new Label();
        instruccion.setText("Ingrese su nombre: ");
        instruccion.setAlignment(Pos.CENTER);

        //INGRESAR NOMBRE DEL JUGADOR
        TextField nombreJugadorTextField = new TextField();
        nombreJugadorTextField.setPromptText("Ingrese su nombre");


        Label etiqueta = new Label();

        //BOTON SUBMIT NOMBRE
        Button botonEnviarNombre = new Button();
        botonEnviarNombre.setText("OK");
        BotonEnviarNombreEventHandler botonEnviarNombreEventHandler = new BotonEnviarNombreEventHandler(nombreJugadorTextField,etiqueta);
        botonEnviarNombre.setOnAction(botonEnviarNombreEventHandler);

        NombreJugadorTextFieldEventHandler nombreJugadorTextFieldEventHandler = new NombreJugadorTextFieldEventHandler(botonEnviarNombre);
        nombreJugadorTextField.setOnKeyPressed(nombreJugadorTextFieldEventHandler);

        //CONTENEDOR HORIZONTAL TEXTFIELD + BOTON_ENVIAR
        HBox contenedorHorizontal = new HBox();
        contenedorHorizontal.getChildren().addAll(nombreJugadorTextField,botonEnviarNombre);
        contenedorHorizontal.setAlignment(Pos.CENTER);

        contenedorHorizontal.setSpacing(15);

        //CONTENEDOR VERTICAL INSTRUCCION + CONT_HORIZONTAL + LABEL_SALUDO
        VBox contenedorVertical = new VBox();
        contenedorVertical.getChildren().addAll(instruccion,contenedorHorizontal,etiqueta);
        contenedorVertical.setAlignment(Pos.CENTER);

        contenedorVertical.setSpacing(15);

        //CAMBIO DE ESCENA
        Scene nuevaEscena = new Scene(contenedorVertical, 640, 480);
        stage.setScene(nuevaEscena);
        stage.show();
    }
}

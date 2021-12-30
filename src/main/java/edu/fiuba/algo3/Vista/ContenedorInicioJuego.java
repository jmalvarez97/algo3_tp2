package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ContenedorInicioJuego extends VBox {


    Partida partida;
    Stage stage;

    public ContenedorInicioJuego(Partida partida, Stage stage){
        this.partida = partida;
        this.stage = stage;

        Label instruccion = new Label();
        instruccion.setText("Ingrese su nombre: ");
        instruccion.setAlignment(Pos.CENTER);

        //INGRESAR NOMBRE DEL JUGADOR
        TextField nombreJugadorTextField = new TextField();
        nombreJugadorTextField.setPromptText("Ingrese su nombre");


        VBox contenedorVertical = new VBox();
        contenedorVertical.setAlignment(Pos.CENTER);

        //BOTON SUBMIT NOMBRE
        Button botonEnviarNombre = new Button();
        botonEnviarNombre.setText("OK");
        BotonEnviarNombreEventHandler botonEnviarNombreEventHandler = new BotonEnviarNombreEventHandler(nombreJugadorTextField,contenedorVertical,partida,stage);
        botonEnviarNombre.setOnAction(botonEnviarNombreEventHandler);

        NombreJugadorTextFieldEventHandler nombreJugadorTextFieldEventHandler = new NombreJugadorTextFieldEventHandler(botonEnviarNombre);
        nombreJugadorTextField.setOnKeyPressed(nombreJugadorTextFieldEventHandler);

        //CONTENEDOR HORIZONTAL TEXTFIELD + BOTON_ENVIAR
        HBox contenedorHorizontal = new HBox();
        contenedorHorizontal.getChildren().addAll(nombreJugadorTextField,botonEnviarNombre);
        contenedorHorizontal.setAlignment(Pos.CENTER);

        contenedorHorizontal.setSpacing(15);

        this.getChildren().addAll(instruccion,contenedorHorizontal,contenedorVertical);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
        this.setPadding(new Insets(20));
    }
}

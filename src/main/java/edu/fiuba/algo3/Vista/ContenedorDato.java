package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.DatoTextFieldEventHandler;
import edu.fiuba.algo3.Controlador.Partida;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ContenedorDato extends HBox {

    private Stage stage;
    private Partida partida;
    private Button botonCargar;

    public ContenedorDato(Stage stage, Partida partida, String dato, Button botonCargar){
        this.stage = stage;
        this.partida = partida;
        this.botonCargar = botonCargar;

        Label nombreDato = new Label();
        nombreDato.setText(dato + ": ");

        TextField datoTextField = new TextField();
        datoTextField.setPromptText("Ingrese el " + dato);

        DatoTextFieldEventHandler datoTextFieldEventHandler = new DatoTextFieldEventHandler(botonCargar);
        datoTextField.setOnKeyPressed(datoTextFieldEventHandler);

        this.getChildren().addAll(nombreDato,datoTextField);
        this.setAlignment(Pos.CENTER_LEFT);
        this.setSpacing(5);
        this.setPadding(new Insets(10));
    }
}

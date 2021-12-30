package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class BotonBancoEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Partida partida;
    private Button boton;

    public BotonBancoEventHandler(Stage stage,Partida partida,Button boton){
        this.stage = stage;
        this.partida = partida;
        this.boton = boton;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String pista = partida.visitar(boton.getText());

        Text nombreEdificio = new Text();
        nombreEdificio.setText(boton.getText());
        nombreEdificio.setFont(Font.font("", FontWeight.EXTRA_BOLD, FontPosture.ITALIC,40));
        nombreEdificio.setTextAlignment(TextAlignment.CENTER);

        Label labelPista = new Label();
        labelPista.setText(pista);
        labelPista.setWrapText(true);

        VBox contenedorVertical = new VBox();
        contenedorVertical.getChildren().addAll(nombreEdificio,labelPista);
        contenedorVertical.setAlignment(Pos.TOP_CENTER);
        contenedorVertical.setPadding(new Insets(20));

        Scene nuevaEscena = new Scene(contenedorVertical,640,480);
        stage.setScene(nuevaEscena);
        stage.show();
    }
}

package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.ContenedorEdificioPista;
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

public class BotonEdificioEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Partida partida;
    private Button boton;
    private Scene escenaEdificios;

    public BotonEdificioEventHandler(Stage stage,Partida partida,Button boton,Scene escenaEdificios){
        this.stage = stage;
        this.partida = partida;
        this.boton = boton;
        this.escenaEdificios = escenaEdificios;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String pista = partida.visitar(boton.getText());

        ContenedorEdificioPista contenedorEdificioPista = new ContenedorEdificioPista(boton,pista);

        //BOTON VOLVER
        Button botonVolver = new Button();
        botonVolver.setText("Volver");
        BotonVolverEventHandler botonVolverEventHandler = new BotonVolverEventHandler(stage,escenaEdificios);
        botonVolver.setOnAction(botonVolverEventHandler);

        VBox contenedorVertical = new VBox();
        contenedorVertical.getChildren().addAll(contenedorEdificioPista,botonVolver);
        contenedorVertical.setAlignment(Pos.TOP_CENTER);
        contenedorVertical.setPadding(new Insets(20));

        Scene nuevaEscena = new Scene(contenedorVertical,640,480);
        stage.setScene(nuevaEscena);
        stage.show();
    }
}

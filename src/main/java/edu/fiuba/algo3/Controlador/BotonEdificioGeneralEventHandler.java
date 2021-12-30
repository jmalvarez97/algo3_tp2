package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.ContenedorPistaEdificio;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BotonEdificioGeneralEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Partida partida;
    private Button boton;
    private Scene escenaElegirEdificio;

    public BotonEdificioGeneralEventHandler(Stage stage, Partida partida, Button boton, Scene escenaElegirEdificio){
        this.stage = stage;
        this.partida = partida;
        this.boton = boton;
        this.escenaElegirEdificio = escenaElegirEdificio;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String pista = partida.visitar(boton.getText());

        ContenedorPistaEdificio contenedorEdificioPista = new ContenedorPistaEdificio(boton,pista);

        //BOTON VOLVER
        Button botonVolver = new Button();
        botonVolver.setText("Volver");
        BotonVolverEventHandler botonVolverEventHandler = new BotonVolverEventHandler(stage,escenaElegirEdificio);
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

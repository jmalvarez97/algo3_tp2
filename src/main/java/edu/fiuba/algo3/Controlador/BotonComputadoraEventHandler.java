package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.ContenedorComputadora;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class BotonComputadoraEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Scene escenaCiudad;
    private Partida partida;

    public BotonComputadoraEventHandler(Stage stage,Scene escenaCiudad,Partida partida){

        this.stage = stage;
        this.escenaCiudad = escenaCiudad;
        this.partida = partida;

    }

    @Override
    public void handle(ActionEvent actionEvent) {

        ContenedorComputadora contenedorComputadora = new ContenedorComputadora(stage,partida);
        contenedorComputadora.setAlignment(Pos.CENTER);

        //BOTON VOLVER
        Button botonVolver = new Button();
        botonVolver.setText("Volver");
        BotonVolverEventHandler botonVolverEventHandler = new BotonVolverEventHandler(stage,escenaCiudad);
        botonVolver.setOnAction(botonVolverEventHandler);

        VBox contenedor = new VBox();
        contenedor.getChildren().addAll(contenedorComputadora,botonVolver);
        contenedor.setSpacing(15);
        contenedor.setAlignment(Pos.CENTER);

        Scene escenaNueva = new Scene(contenedor,640,480);
        stage.setScene(escenaNueva);
        stage.show();
    }
}
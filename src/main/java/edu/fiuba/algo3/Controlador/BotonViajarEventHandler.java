package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.Ciudad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BotonViajarEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Scene escenaCiudad;
    private Partida partida;

    public BotonViajarEventHandler(Stage stage,Scene escenaCiudad,Partida partida){

        this.stage = stage;
        this.escenaCiudad = escenaCiudad;
        this.partida = partida;

    }

    @Override
    public void handle(ActionEvent actionEvent) {

        Label label = new Label("A dónde querés viajar?");
        ArrayList<Ciudad> listaCiudades = partida.opcionesParaViajar();

        HBox contenedorCiudades = new HBox();

        for(int i = 0; i < listaCiudades.size(); i++){
            Ciudad ciudad = listaCiudades.get(i);

            Button botonCiudad = new Button();
            botonCiudad.setText(ciudad.getNombre());
            BotonCiudadEventHandler botonCiudadEventHandler = new BotonCiudadEventHandler(ciudad,partida,stage);
            botonCiudad.setOnAction(botonCiudadEventHandler);
            contenedorCiudades.getChildren().add(botonCiudad);
        }

        contenedorCiudades.setSpacing(10);
        contenedorCiudades.setAlignment(Pos.CENTER);

        //BOTON VOLVER
        Button botonVolver = new Button();
        botonVolver.setText("Volver");
        BotonVolverEventHandler botonVolverEventHandler = new BotonVolverEventHandler(stage,escenaCiudad);
        botonVolver.setOnAction(botonVolverEventHandler);

        VBox contenedor = new VBox();
        contenedor.getChildren().addAll(label,contenedorCiudades,botonVolver);
        contenedor.setSpacing(150);
        contenedor.setAlignment(Pos.CENTER);

        Scene escenaNueva = new Scene(contenedor,640,480);
        stage.setScene(escenaNueva);
        stage.show();
    }
}

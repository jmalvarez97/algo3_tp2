package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.ContenedorCiudad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BotonContinuarEventHandler implements EventHandler<ActionEvent> {

    private Partida partida;
    private Stage stage;

    public BotonContinuarEventHandler(Partida partida, Stage stage) {

        this.partida = partida;
        this.stage = stage;

    }

    @Override
    public void handle(ActionEvent actionEvent) {

        ContenedorCiudad contenedorCiudad = new ContenedorCiudad(partida,stage);
        //Scene escenaNueva = new Scene(contenedorCiudad,640,480);
        //stage.setScene(escenaNueva);

    }
}

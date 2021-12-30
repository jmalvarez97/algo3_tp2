package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonVolverEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Scene escenaCiudad;

    public BotonVolverEventHandler(Stage stage,Scene escenaCiudad){
        this.stage = stage;
        this.escenaCiudad = escenaCiudad;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(escenaCiudad);
    }
}

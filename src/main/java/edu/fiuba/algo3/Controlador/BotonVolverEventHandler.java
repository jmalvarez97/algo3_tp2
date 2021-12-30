package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonVolverEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Scene escenaAnterior;

    public BotonVolverEventHandler(Stage stage,Scene escenaAnterior){
        this.stage = stage;
        this.escenaAnterior = escenaAnterior;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(escenaAnterior);
        stage.show();
    }
}

package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSalirEventHandler implements EventHandler<ActionEvent> {

    public BotonSalirEventHandler(){}

    @Override
    public void handle(ActionEvent actionEvent) {
        System.exit(0);
    }
}

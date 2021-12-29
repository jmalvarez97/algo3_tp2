package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class BotonEnviarNombreEventHandler implements EventHandler<ActionEvent> {

    private TextField textField;
    private Label label;

    public BotonEnviarNombreEventHandler(TextField textField, Label label){
        this.textField = textField;
        this.label = label;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        if(this.textField.getText().trim().equals("")) {
            this.label.setText("Debe ingresar un Nombre.");
            this.label.setTextFill(Color.RED);
            this.textField.requestFocus();

        } else {

            this.label.setText("Hola, " + this.textField.getText() + "!");
            this.label.setTextFill(Color.GREEN);
        }

    }
}

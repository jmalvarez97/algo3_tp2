package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BotonEnviarNombreEventHandler implements EventHandler<ActionEvent> {

    private TextField textField;
    private VBox contenedorInfoTesoro;
    private Partida partida;
    private Stage stage;

    public BotonEnviarNombreEventHandler(TextField textField, VBox contenedorVertical, Partida partida,Stage stage){
        this.textField = textField;
        this.contenedorInfoTesoro = contenedorVertical;
        this.partida = partida;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        Label label1 = new Label();
        Label label2 = new Label();

        if(this.textField.getText().trim().equals("")) {
            label1.setText("Debe ingresar un Nombre.");
            label1.setTextFill(Color.RED);
            this.contenedorInfoTesoro.getChildren().addAll(label1);
            this.textField.requestFocus();

        } else {
            label1.setText("Hola, " + textField.getText() + "! Se robaron el tesoro: " + partida.nombreCompletoTesoro() + ".");
            label2.setText("Tu mision es encontrarlo cuanto antes!");
            label1.setTextFill(Color.GREEN);
            label2.setTextFill(Color.GREEN);

            Button botonContinuar = new Button();
            botonContinuar.setText("Continuar");
            botonContinuar.requestFocus();

            BotonContinuarEventHandler botonContinuarEventHandler = new BotonContinuarEventHandler(this.partida,this.stage);
            botonContinuar.setOnAction(botonContinuarEventHandler);

            this.contenedorInfoTesoro.getChildren().addAll(label1,label2,botonContinuar);
            this.contenedorInfoTesoro.setSpacing(15);
        }

    }
}

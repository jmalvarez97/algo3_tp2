package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BotonIniciarEventHandler implements EventHandler<ActionEvent> {

    Stage stage;

    public BotonIniciarEventHandler(Stage stage){
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        TextField textoInicioDeJuego = new TextField();
        textoInicioDeJuego.setText("Ponele que estás jugando...");
        textoInicioDeJuego.setAlignment(Pos.CENTER);

        Scene nuevaEscena = new Scene(textoInicioDeJuego, 640, 480);
        stage.setScene(nuevaEscena);
        stage.show();
    }
}

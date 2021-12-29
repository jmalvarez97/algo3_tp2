package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.Tesoro;
import edu.fiuba.algo3.Vista.ContenedorInicioJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BotonIniciarEventHandler implements EventHandler<ActionEvent> {

    Stage stage;
    Partida partida;

    public BotonIniciarEventHandler(Stage stage, Partida partida){
        this.stage = stage;
        this.partida = partida;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        ContenedorInicioJuego contenedorVertical = new ContenedorInicioJuego(this.partida, this.stage);

        //CAMBIO DE ESCENA
        Scene nuevaEscena = new Scene(contenedorVertical, 640, 480);
        stage.setScene(nuevaEscena);
        stage.show();
    }
}

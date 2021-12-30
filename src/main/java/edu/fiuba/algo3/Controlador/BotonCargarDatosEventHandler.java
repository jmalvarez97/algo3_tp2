package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.ContenedorDato;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BotonCargarDatosEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Partida partida;
    private ArrayList<ContenedorDato> contenedores;

    public BotonCargarDatosEventHandler(Stage stage,Partida partida,ArrayList<ContenedorDato> contenedores){
        this.stage = stage;
        this.partida = partida;
        this.contenedores = contenedores;
    }

    @Override
    public void handle(ActionEvent actionEvent){

        ContenedorDato contenedorSexo = contenedores.get(0);
        if(!contenedorSexo.getTextField().getText().trim().equals("")){
            this.partida.cargarSexo(contenedorSexo.getTextField().getText());
        }

        ContenedorDato contenedorHobby = contenedores.get(1);
        if(!contenedorHobby.getTextField().getText().trim().equals("")){
            this.partida.cargarHobby(contenedorHobby.getTextField().getText());
        }

        ContenedorDato contenedorSenia = contenedores.get(2);
        if(!contenedorSenia.getTextField().getText().trim().equals("")){
            this.partida.cargarSenia(contenedorSenia.getTextField().getText());
        }

        ContenedorDato contenedorPelo = contenedores.get(3);
        if(!contenedorPelo.getTextField().getText().trim().equals("")){
            this.partida.cargarPelo(contenedorPelo.getTextField().getText());
        }

        ContenedorDato contenedorCoche = contenedores.get(4);
        if(!contenedorCoche.getTextField().getText().trim().equals("")){
            this.partida.cargarVehiculo(contenedorCoche.getTextField().getText());
        }
    }
}

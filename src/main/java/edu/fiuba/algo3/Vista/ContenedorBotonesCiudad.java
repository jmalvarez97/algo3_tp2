package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.BotonComputadoraEventHandler;
import edu.fiuba.algo3.Controlador.BotonEdificiosEventHandler;
import edu.fiuba.algo3.Controlador.BotonViajarEventHandler;
import edu.fiuba.algo3.Controlador.Partida;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ContenedorBotonesCiudad extends HBox {

    private Stage stage;
    private Scene escenaCiudad;
    private Partida partida;

    ContenedorBotonesCiudad(Stage stage, Scene escenaCiudad, Partida partida){

        this.stage = stage;
        this.escenaCiudad = escenaCiudad;
        this.partida = partida;

        Button botonViajar = new Button();
        botonViajar.setText("Viajar");
        BotonViajarEventHandler botonViajarEventHandler = new BotonViajarEventHandler(stage,escenaCiudad,partida);
        botonViajar.setOnAction(botonViajarEventHandler);

        Button botonEdificios = new Button();
        botonEdificios.setText("Edificios");
        BotonEdificiosEventHandler botonEdificiosEventHandler = new BotonEdificiosEventHandler(stage,escenaCiudad,partida);
        botonEdificios.setOnAction(botonEdificiosEventHandler);

        Button botonComputadora = new Button();
        botonComputadora.setText("PC");
        BotonComputadoraEventHandler botonComputadoraEventHandler = new BotonComputadoraEventHandler(stage,escenaCiudad,partida);
        botonComputadora.setOnAction(botonComputadoraEventHandler);

        this.getChildren().addAll(botonViajar,botonEdificios,botonComputadora);
        this.setAlignment(Pos.BASELINE_CENTER);
        this.setSpacing(15);
    }
}

package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.BotonIniciarEventHandler;
import edu.fiuba.algo3.Controlador.BotonSalirEventHandler;
import edu.fiuba.algo3.Controlador.Partida;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ContenedorInicio extends VBox {

    Partida partida;
    Stage stage;

    public ContenedorInicio(Partida partida, Stage stage){
        this.partida = partida;
        this.stage = stage;

        Text titulo1 = new Text();
        titulo1.setText("Dónde mierda está");
        titulo1.setFont(Font.font("",FontWeight.EXTRA_BOLD, FontPosture.ITALIC,50));
        titulo1.setTextAlignment(TextAlignment.CENTER);

        Text titulo2 = new Text();
        titulo2.setText("Carmen Sandiego?");
        titulo2.setFont(Font.font("",FontWeight.EXTRA_BOLD, FontPosture.ITALIC,50));
        titulo2.setTextAlignment(TextAlignment.CENTER);

        VBox contenedorTexto = new VBox();
        contenedorTexto.getChildren().add(titulo1);
        contenedorTexto.getChildren().add(titulo2);
        contenedorTexto.setAlignment(Pos.TOP_CENTER);

        Button botonIniciar = new Button();
        botonIniciar.setText("Jugar");

        BotonIniciarEventHandler botonIniciarEventHandler = new BotonIniciarEventHandler(stage);
        botonIniciar.setOnAction(botonIniciarEventHandler);

        Button botonSalir = new Button();
        botonSalir.setText("Salir");

        BotonSalirEventHandler botonSalirEventHandler = new BotonSalirEventHandler();
        botonSalir.setOnAction(botonSalirEventHandler);

        Label nombreGrupo = new Label();
        nombreGrupo.setText("Grupo 4");
        nombreGrupo.setAlignment(Pos.BASELINE_LEFT);

        Label materia = new Label();
        materia.setText("Algo3 - 2c2021");
        materia.setAlignment(Pos.BASELINE_RIGHT);

        HBox contenedorDatos = new HBox();
        contenedorDatos.getChildren().addAll(nombreGrupo, materia);
        contenedorDatos.setSpacing(410);
        contenedorDatos.setAlignment(Pos.BASELINE_CENTER);

        this.getChildren().addAll(contenedorTexto,botonIniciar,botonSalir,contenedorDatos);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(20));
    }



}

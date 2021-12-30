package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.BotonCargarDatosEventHandler;
import edu.fiuba.algo3.Controlador.Partida;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ContenedorComputadora extends VBox {

    private Stage stage;
    private Partida partida;
    private Scene escenaComputadora;

    public ContenedorComputadora(Stage stage, Partida partida, Scene escenaComputadora){
        this.stage = stage;
        this.partida = partida;
        this.escenaComputadora = escenaComputadora;

        Button botonCargarDatos = new Button();
        botonCargarDatos.setText("Cargar Datos");
        botonCargarDatos.setAlignment(Pos.CENTER);

        //TITULO COMPUTADORA
        Text tituloPC = new Text();
        tituloPC.setText("Computadora");
        tituloPC.setFont(Font.font("", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,20));
        tituloPC.setTextAlignment(TextAlignment.CENTER);

        //CONTENEDORES
        ContenedorDato contenedorSexo = new ContenedorDato(stage,partida,"Sexo",botonCargarDatos);
        ContenedorDato contenedorHobby = new ContenedorDato(stage,partida,"Hobby",botonCargarDatos);
        ContenedorDato contenedorSenia = new ContenedorDato(stage,partida,"Senia",botonCargarDatos);
        ContenedorDato contenedorPelo = new ContenedorDato(stage,partida,"Pelo",botonCargarDatos);
        ContenedorDato contenedorCoche = new ContenedorDato(stage,partida,"Coche",botonCargarDatos);

        //ARRAY DE CONTENEDORES
        ArrayList<ContenedorDato> contenedores = new ArrayList<>();
        contenedores.add(contenedorSexo);
        contenedores.add(contenedorHobby);
        contenedores.add(contenedorSenia);
        contenedores.add(contenedorPelo);
        contenedores.add(contenedorCoche);

        BotonCargarDatosEventHandler botonCargarDatosEventHandler = new BotonCargarDatosEventHandler(stage, partida, contenedores,this.escenaComputadora);
        botonCargarDatos.setOnAction(botonCargarDatosEventHandler);

        this.getChildren().add(tituloPC);
        for(int i = 0; i < contenedores.size(); i++){
            this.getChildren().add(contenedores.get(i));
        }
        this.getChildren().add(botonCargarDatos);
    }
}


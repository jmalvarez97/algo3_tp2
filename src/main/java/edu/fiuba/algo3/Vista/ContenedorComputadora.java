package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.Partida;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ContenedorComputadora extends VBox {

    private Stage stage;
    private Partida partida;

    public ContenedorComputadora(Stage stage, Partida partida){
        this.stage = stage;
        this.partida = partida;

        Button botonCargarDatos = new Button();
        botonCargarDatos.setText("Cargar Datos");
        botonCargarDatos.setAlignment(Pos.CENTER);

        //TITULO COMPUTADORA
        Text tituloPC = new Text();
        tituloPC.setText("Computadora");
        tituloPC.setFont(Font.font("", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,20));
        tituloPC.setTextAlignment(TextAlignment.CENTER);

        ContenedorDato contenedorSexo = new ContenedorDato(stage,partida,"Sexo",botonCargarDatos);
        ContenedorDato contenedorHobby = new ContenedorDato(stage,partida,"Hobby",botonCargarDatos);
        ContenedorDato contenedorSenia = new ContenedorDato(stage,partida,"Senia",botonCargarDatos);
        ContenedorDato contenedorPelo = new ContenedorDato(stage,partida,"Pelo",botonCargarDatos);
        ContenedorDato contenedorCoche = new ContenedorDato(stage,partida,"Coche",botonCargarDatos);
        ContenedorDato contenedorOcupacion = new ContenedorDato(stage,partida,"Ocupacion",botonCargarDatos);
        ContenedorDato contenedorOtro = new ContenedorDato(stage,partida,"Otro",botonCargarDatos);


        this.getChildren().addAll(tituloPC,contenedorSexo,contenedorHobby,contenedorSenia,contenedorPelo,contenedorCoche,contenedorOcupacion,contenedorOtro,botonCargarDatos);
        //this.setPadding(new Insets(10));
    }
}

/*
- Sexo
- Hobby
- Senia
- Color Pelo
- Coche
- Ocupacion
- Otros
 */

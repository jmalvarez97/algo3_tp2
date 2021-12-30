package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.BotonVolverEventHandler;
import edu.fiuba.algo3.Controlador.Partida;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ContenedorSospechosos extends VBox {

    private Stage stage;
    private Partida partida;
    private VBox contenedorNombres;
    private int cantidadSospechosos;
    private Scene escenaComputadora;

    public ContenedorSospechosos(Stage stage, Partida partida,VBox contenedorNombres,int cantidadSospechosos,Scene escenaComputadora){
        this.stage = stage;
        this.partida = partida;
        this.contenedorNombres = contenedorNombres;
        this.cantidadSospechosos = cantidadSospechosos;
        this.escenaComputadora = escenaComputadora;

        Text titulo = new Text();
        titulo.setText("Lista de Sospechosos");
        titulo.setFont(Font.font("", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,20));
        titulo.setTextAlignment(TextAlignment.CENTER);

        this.contenedorNombres.setSpacing(5);

        //BOTON VOLVER
        Button botonVolver = new Button();
        botonVolver.setText("Volver");
        BotonVolverEventHandler botonVolverEventHandler = new BotonVolverEventHandler(stage,escenaComputadora);
        botonVolver.setOnAction(botonVolverEventHandler);

        this.getChildren().addAll(titulo,contenedorNombres,botonVolver);

        if(cantidadSospechosos == 1){
            Label ordenDeArresto = new Label();
            ordenDeArresto.setText("Se ha emitido una Orden de Arresto para el Ladrón!");
            ordenDeArresto.setWrapText(true);
            this.getChildren().add(ordenDeArresto);
        }

        Scene escenaListaSospechosos = new Scene(this,640,480);
        this.stage.setScene(escenaListaSospechosos);
        this.stage.show();
    }
}

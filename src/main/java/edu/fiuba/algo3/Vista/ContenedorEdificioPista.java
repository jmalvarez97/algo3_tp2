package edu.fiuba.algo3.Vista;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;

public class ContenedorEdificioPista extends VBox {

    public ContenedorEdificioPista(Button boton,String pista){
        Text nombreEdificio = new Text();
        nombreEdificio.setText(boton.getText());
        nombreEdificio.setFont(Font.font("", FontWeight.EXTRA_BOLD, FontPosture.ITALIC,40));
        nombreEdificio.setTextAlignment(TextAlignment.CENTER);

        Label labelPista = new Label();
        labelPista.setText(pista);
        labelPista.setWrapText(true);
    }
}

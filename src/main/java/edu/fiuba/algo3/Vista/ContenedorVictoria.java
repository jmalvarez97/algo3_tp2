package edu.fiuba.algo3.Vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ContenedorVictoria extends VBox {

    private Stage stage;
    public ContenedorVictoria(Stage stage){

        this.stage = stage;

        Text titulo = new Text();
        titulo.setText("GANASTE!!");
        titulo.setFont(Font.font("", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,50));
        titulo.setTextAlignment(TextAlignment.CENTER);

        Label label = new Label();
        label.setText("Felicitaciones, atrapaste al Ladrón! Muchas gracias por tu ayuda!!");
        label.setWrapText(true);

        this.getChildren().addAll(titulo,label);
        this.setSpacing(20);
        this.setAlignment(Pos.CENTER);

        Scene escenaVictoria = new Scene(this,640,480);
        this.stage.setScene(escenaVictoria);
        this.stage.show();
    }
}

package edu.fiuba.algo3.Vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ContenedorDerrota extends VBox {

    private Stage stage;
    public ContenedorDerrota(Stage stage){

        this.stage = stage;

        Text titulo = new Text();
        titulo.setText("PERDISTE :(");
        titulo.setFont(Font.font("", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,50));
        titulo.setTextAlignment(TextAlignment.CENTER);

        Label label = new Label();
        label.setText("No pudiste atrapar al ladrón... Mejor suerte la próxima.");
        label.setWrapText(true);

        this.getChildren().addAll(titulo,label);
        this.setSpacing(20);
        this.setAlignment(Pos.CENTER);

        Scene escenaDerrota = new Scene(this,640,480);
        this.stage.setScene(escenaDerrota);
        this.stage.show();
    }
}

package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.Partida;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ContenedorSospechosos extends VBox {

    private Stage stage;
    private Partida partida;
    private VBox contenedorNombres;
    private int cantidadSospechosos;

    public ContenedorSospechosos(Stage stage, Partida partida,VBox contenedorNombres,int cantidadSospechosos){
        this.stage = stage;
        this.partida = partida;
        this.contenedorNombres = contenedorNombres;
        this.cantidadSospechosos = cantidadSospechosos;

        Text titulo = new Text();
        titulo.setText("Lista de Sospechosos");
        titulo.setFont(Font.font("", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,20));
        titulo.setTextAlignment(TextAlignment.CENTER);

        this.contenedorNombres.setSpacing(5);

        this.getChildren().addAll(titulo,contenedorNombres);
        Scene escenaListaSospechosos = new Scene(this,640,480);
        this.stage.setScene(escenaListaSospechosos);
        this.stage.show();
    }
}

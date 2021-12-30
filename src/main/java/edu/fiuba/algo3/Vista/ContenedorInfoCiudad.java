package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Modelardo.Ciudad;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;

public class ContenedorInfoCiudad extends VBox {

    private Ciudad ciudad;

    public ContenedorInfoCiudad(Ciudad ciudad){
        Text nombreCiudad = new Text();
        nombreCiudad.setText(ciudad.getNombre());
        nombreCiudad.setFont(Font.font("", FontWeight.EXTRA_BOLD, FontPosture.ITALIC,40));
        nombreCiudad.setTextAlignment(TextAlignment.CENTER);

        Label infoCiudad = new Label();
        infoCiudad.setText(ciudad.getDescripcion());
        infoCiudad.setWrapText(true);

        this.getChildren().addAll(nombreCiudad,infoCiudad);
        this.setPadding(new Insets(20));
        this.setAlignment(Pos.TOP_CENTER);
    }
}

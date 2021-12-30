package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.Partida;
import edu.fiuba.algo3.Modelardo.Ciudad;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorCiudad extends VBox {

    private Partida partida;
    private Ciudad ciudad;
    private Stage stage;

    public ContenedorCiudad(Partida partida, Stage stage){
        this.partida = partida;
        this.stage = stage;
        this.ciudad = partida.ciudadActual();

        Scene escenaNueva = new Scene(this,640,480);

        ContenedorInfoCiudad contenedorInfoCiudad = new ContenedorInfoCiudad(ciudad);
        ContenedorBotonesCiudad contenedorBotonesCiudad = new ContenedorBotonesCiudad(stage,escenaNueva,partida);

        this.getChildren().addAll(contenedorInfoCiudad,contenedorBotonesCiudad);
        this.setPadding(new Insets(20));
        this.setSpacing(150);

        stage.setScene(escenaNueva);
    }
}

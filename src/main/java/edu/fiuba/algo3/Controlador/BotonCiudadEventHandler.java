package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.Ciudad;
import edu.fiuba.algo3.Vista.ContenedorCiudad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class BotonCiudadEventHandler implements EventHandler<ActionEvent> {

    private Ciudad ciudad;
    private Partida partida;
    private Stage stage;

    public BotonCiudadEventHandler(Ciudad ciudad,Partida partida,Stage stage){
        this.ciudad = ciudad;
        this.partida = partida;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        partida.viajar(ciudad);

        ContenedorCiudad contenedorCiudadNueva = new ContenedorCiudad(partida,stage);
        contenedorCiudadNueva.setAlignment(Pos.TOP_CENTER);
    }
}

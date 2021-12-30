package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Modelardo.Ciudad;
import edu.fiuba.algo3.Vista.ContenedorCiudad;
import edu.fiuba.algo3.Vista.ContenedorDerrota;
import edu.fiuba.algo3.Vista.ContenedorVictoria;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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

        if(partida.cumplePaisesNecesarios()){
            if(partida.ganoUsuario()) {
                ContenedorVictoria contenedorVictoria = new ContenedorVictoria(stage);
            }

            ContenedorDerrota contenedorDerrota = new ContenedorDerrota(stage);
        }

        ContenedorCiudad contenedorCiudadNueva = new ContenedorCiudad(partida,stage);
        contenedorCiudadNueva.setAlignment(Pos.TOP_CENTER);
    }
}

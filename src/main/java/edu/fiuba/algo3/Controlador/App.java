package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.ContenedorInicio;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Dónde $@#! está Carmen Sandiego?");

        Partida partida = new Partida();

        ContenedorInicio contenedorInicio = new ContenedorInicio(partida, stage);

        var scene = new Scene(contenedorInicio, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        //Primer Pantalla:
        //Mensaje introductorio al juego. Mencionar que tesoro fue robado y su valor.
        //Mencionar el sexo del sospechoso. "Toque cualquier tecla para continuar"

        //Segunda Pantalla (se itera de ciudad a ciudad):
        //Opcion 1: Usar la computadora y cargar datos/ver sospechosos
        //Opcion 2: Viajar/elegir pais proximo
        //Opcion 3: Entrar a algun edificio
        //Tercera Pantalla:
        //Pop up Opcion 2: Ingresar a algun edifico
        //Al elegir un edificio -> dar una pista relacionada al edificio
    }

}
package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class NombreJugadorTextFieldEventHandler implements EventHandler<KeyEvent> {

    private Button botonEnviar;

    public NombreJugadorTextFieldEventHandler(Button botonEnviar){
        this.botonEnviar = botonEnviar;
    }

    @Override
    public void handle(KeyEvent keyEvent){

        System.out.println(keyEvent.getCode());

        if(keyEvent.getCode() == KeyCode.ENTER){
            Event.fireEvent(botonEnviar, new ActionEvent());
        }
    }
}

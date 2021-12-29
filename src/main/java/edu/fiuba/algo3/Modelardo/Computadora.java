package edu.fiuba.algo3.Modelardo;


import edu.fiuba.algo3.Modelardo.Decorator.*;

import java.util.ArrayList;
import java.util.Objects;

public class Computadora {
    private ArrayList<Ladron> listaLadrones;
    private Pregunta ladron;
    private Ladron ladronOrdenDeArresto = null;


    public Computadora(ArrayList<Ladron> listaLadrones){
        this.listaLadrones = listaLadrones;
        this.ladron = new Ladron();
    }


    public void cargarPelo(String pelo){
        this.ladron = new ColorDePelo(this.ladron, pelo);
    }

    public void cargarHobby(String pelo){
        this.ladron = new Hobby(this.ladron, pelo);
    }

    public void cargarVehiculo(String pelo){
        this.ladron = new Vehiculo(this.ladron, pelo);
    }

    public void cargarSexo(String pelo){
        this.ladron = new Sexo(this.ladron, pelo);
    }

    public void cargarSenia(String pelo){
        this.ladron = new Senia(this.ladron, pelo);
    }


    public ArrayList<Ladron> buscarSospechosos(){
        ArrayList<Ladron> listaSospechosos = new ArrayList<>();

        for(int i = 0; i < listaLadrones.size(); i++) {
            if (ladron.comparar(listaLadrones.get(i))) {
                listaSospechosos.add(listaLadrones.get(i));
            }
        }

        if(listaSospechosos.size() == 1){
            emitirOrdenDeArresto(listaSospechosos.get(0));
        }

        return listaSospechosos;
    }

    public void emitirOrdenDeArresto(Ladron ladron){
        this.ladronOrdenDeArresto = ladron;
    }

    public boolean chequearOrdenDeArresto(Ladron ladronReal) {
        if(ladronOrdenDeArresto == null) {
            return false;
        }
        return Objects.equals(ladronReal.nombre(),ladronOrdenDeArresto.nombre());
    }
}

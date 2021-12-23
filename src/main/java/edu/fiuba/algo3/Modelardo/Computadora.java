package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Controlador.LecturaLadrones;
import edu.fiuba.algo3.Modelardo.Decorator.*;

import java.util.ArrayList;

public class Computadora {
    private ArrayList<Ladron> listaLadrones;
    private Pregunta ladron;


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
        return listaSospechosos;

    }


}

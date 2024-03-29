package edu.fiuba.algo3.Modelardo.Decorator;

public abstract class Decorator implements Pregunta {
    String cualidad;
    Pregunta pregunta;

    Decorator(Pregunta unaPregunta,String cualidad){
        this.pregunta = unaPregunta;
        this.cualidad = cualidad;
    }

    public boolean comparar(Ladron otroLadron) {
        return this.pregunta.comparar(otroLadron);
    }
}

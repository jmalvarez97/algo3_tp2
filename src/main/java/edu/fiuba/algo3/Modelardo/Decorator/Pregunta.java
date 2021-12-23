package edu.fiuba.algo3.Modelardo.Decorator;
import edu.fiuba.algo3.Modelardo.Ladron;

public interface Pregunta {
    // le paso otro ladron y me fijo si ladron esta incluido en OtroLadron
    boolean comparar(Ladron otroLadron);

}

package edu.fiuba.algo3.modelo;

public interface StatePolicia {
    int velocidad();

    void confirmarCaso(int casosResueltos);
    void setPolicia(Policia policia);
    int horasDeViaje(double distancia);
    String valorObjetoBuscado();
}

package edu.fiuba.algo3.Modelardo.Policia;

import edu.fiuba.algo3.Modelardo.Pista;
import edu.fiuba.algo3.Modelardo.Tesoro;

import java.util.ArrayList;

public abstract class StatePolicia{

    protected int velocidad;
    protected Policia policia;
    protected String valorObjetoBuscado;


    abstract void confirmarCaso(int casosResueltos);

    public int horasDeViaje(double distancia) {
        return (int) distancia / this.velocidad;
    }

    public void setPolicia(Policia policia){
        this.policia = policia;
    }

    public int velocidad(){
        return this.velocidad;
    }

    public Tesoro devolverTesoroAcorde(ArrayList<Tesoro> listaTesoros){
        for(int i = 0; i < listaTesoros.size(); i++){
            if( (listaTesoros.get(i)).esValor(this.valorObjetoBuscado) ){
                return listaTesoros.get(i);
            }
        }
        return null;
    }

    public abstract Pista pistaValorCorrespondiente();
}

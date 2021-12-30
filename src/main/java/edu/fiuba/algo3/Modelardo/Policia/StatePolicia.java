package edu.fiuba.algo3.Modelardo.Policia;

import edu.fiuba.algo3.Modelardo.Pistas.Pista;
import edu.fiuba.algo3.Modelardo.Tesoro;

import java.util.ArrayList;

public abstract class StatePolicia{

    protected int velocidad;
    protected Policia policia;
    protected String valorObjetoBuscado;


    abstract void confirmarCaso(int casosResueltos);

    public int horasDeViaje(double distancia) {
        int horas = (int) distancia / this.velocidad;
        if (horas==0)
            horas+=1;
        return horas;
    }

    public void setPolicia(Policia policia){
        this.policia = policia;
    }

    public int velocidad(){
        return this.velocidad;
    }

    public Tesoro devolverTesoroAcorde(ArrayList<Tesoro> listaTesoros){
        ArrayList<Tesoro> sublistaTesorosAcorde = new ArrayList<>();
        for(int i = 0; i < listaTesoros.size(); i++){
            if( (listaTesoros.get(i)).esValor(this.valorObjetoBuscado) ){
                //return listaTesoros.get(i);
                sublistaTesorosAcorde.add(listaTesoros.get(i));
            }
        }
        int randomInt = (int) (Math.random() * (sublistaTesorosAcorde.size()));
        return sublistaTesorosAcorde.get(randomInt);
    }

    public abstract Pista pistaValorCorrespondiente();
}

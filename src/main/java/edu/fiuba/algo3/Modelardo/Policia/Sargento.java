package edu.fiuba.algo3.Modelardo.Policia;

import edu.fiuba.algo3.Modelardo.Pistas.PistaDificil;

public class Sargento extends StatePolicia {


    public Sargento(){
        this.velocidad = 1500;
        this.valorObjetoBuscado = "Muy valioso";
    }


    public void confirmarCaso(int casosResueltos){}

    public PistaDificil pistaValorCorrespondiente(){
        return new PistaDificil();
    }

}

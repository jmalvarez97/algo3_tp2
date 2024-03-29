package edu.fiuba.algo3.Modelardo.Policia;

import edu.fiuba.algo3.Modelardo.Pistas.PistaFacil;

public class Novato extends StatePolicia {

    public Novato(){
        this.velocidad = 900;
        this.valorObjetoBuscado = "Comun";
    }

    public void confirmarCaso(int casosResueltos){
        if(casosResueltos >= 5){
            this.policia.setState(new Detective());
        }
    }

    public PistaFacil pistaValorCorrespondiente() {
        return new PistaFacil();
    }
}

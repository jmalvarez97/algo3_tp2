package edu.fiuba.algo3.Modelardo.Policia;

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
}

package edu.fiuba.algo3.Modelardo.Policia;


import edu.fiuba.algo3.Modelardo.Pistas.PistaMedia;

public class Detective extends StatePolicia {

    public Detective() {
        this.velocidad = 1100;
        this.valorObjetoBuscado = "Valioso";
    }

    public void confirmarCaso(int casosResueltos){
        if(casosResueltos >= 10){
            this.policia.setState(new Investigador());
        }
    }

    public PistaMedia pistaValorCorrespondiente(){
        return new PistaMedia();
    }

}

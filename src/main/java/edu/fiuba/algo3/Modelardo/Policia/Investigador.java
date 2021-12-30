package edu.fiuba.algo3.Modelardo.Policia;


import edu.fiuba.algo3.Modelardo.Pistas.PistaMedia;

public class Investigador extends StatePolicia {

    public Investigador(){
        this.velocidad = 1300;
        this.valorObjetoBuscado = "Valioso";
    }

    public void confirmarCaso(int casosResueltos){
        if(casosResueltos >= 20){
            this.policia.setState(new Sargento());
        }

    }

    public PistaMedia pistaValorCorrespondiente(){
        return new PistaMedia();
    }

}

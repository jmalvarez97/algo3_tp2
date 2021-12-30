package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Policia.Policia;

public class Aeropuerto implements Edificio{

    private Pista pista;
    private int contadorVisitas;


    public Aeropuerto(){
        this.contadorVisitas = 0;
    }

    @Override
    public String darPista(Pista pistaValor, Ciudad ciudad){
        this.contadorVisitas++;
        return pistaValor.darPistaBandera(ciudad);
    }

    @Override
    public void descontarHorasDePolicia(Policia policia){
        int horasASacar = Math.min(contadorVisitas, 3);
        policia.descontarHoras(horasASacar);
    }
}

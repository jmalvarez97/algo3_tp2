package edu.fiuba.algo3.Modelardo.Edificios;

import edu.fiuba.algo3.Modelardo.Ciudad;
import edu.fiuba.algo3.Modelardo.Pistas.Pista;
import edu.fiuba.algo3.Modelardo.Policia.Policia;

public class Aeropuerto implements Edificio {

    private Pista pista;
    private int contadorVisitas;


    public Aeropuerto(){
        this.contadorVisitas = 0;
    }

    public Aeropuerto(int visitas){
        this.contadorVisitas=visitas;
    }
    @Override
    public String darPista(Pista pistaValor, Ciudad ciudad){
        this.contadorVisitas++;
        return pistaValor.darPistaViaje(ciudad);
    }

    @Override
    public void descontarHorasDePolicia(Policia policia){
        int horasASacar = Math.min(contadorVisitas, 3);
        policia.descontarHoras(horasASacar);
    }


}

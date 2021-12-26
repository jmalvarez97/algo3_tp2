package edu.fiuba.algo3.Modelardo;

import edu.fiuba.algo3.Modelardo.Policia.Policia;

public class Puerto implements Edificio{

    private Pista pista;
    private int contadorVisitas;

    public Puerto(){
        // Para que no sea siempre la misma, se agarra con un random de algun archivo?
        this.pista = new PistaFacil("Puerto");
        this.contadorVisitas = 0;
    }

    @Override
    public String darPista(Ciudad ciudad){
        this.contadorVisitas++;
        return this.pista.darPista(ciudad.getMoneda());
    }

    @Override
    public void descontarHorasDePolicia(Policia policia){
        int horasASacar = Math.min(contadorVisitas, 3);
        policia.descontarHoras(horasASacar);
    }
}

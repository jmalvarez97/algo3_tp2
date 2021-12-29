package edu.fiuba.algo3.Modelardo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesoroTest {
    Tesoro tesoroComun = new Tesoro("Buenos Aires","Sombrero de Gardel", "Comun");
    Tesoro tesoroValioso = new Tesoro("Buenos Aires", "Sombrero de Gardel", "Valioso");
    Tesoro tesoroMuyValioso = new Tesoro("Buenos Aires", "Sombrero de Gardel", "Muy Valioso");

    @Test
    public void testTesoroComunSeVisitan4PaisesSeChequeaCondicionVictoria(){
        for(int i = 0; i<4 ; i++){
            tesoroComun.sumarPaisCorrecto();
        }

        assert(tesoroComun.cumplePaisesNecesarios());
    }

    @Test
    public void testTesoroValiosoSeVisitan5PaisesSeChequeaCondicionVictoria(){
        for(int i = 0; i<5 ; i++){
            tesoroValioso.sumarPaisCorrecto();
        }

        assert(tesoroValioso.cumplePaisesNecesarios());
    }

    @Test
    public void testTesoroMuyValiosoSeVisitan7PaisesSeChequeaCondicionVictoria(){
        for(int i = 0; i<7 ; i++){
            tesoroMuyValioso.sumarPaisCorrecto();
        }

        assert(tesoroMuyValioso.cumplePaisesNecesarios());
    }

    @Test
    public void testTesoroMuyValiosoSeVisitan5PaisesSeChequeaCondicionVictoria(){
        for(int i = 0; i<5 ; i++){
            tesoroMuyValioso.sumarPaisCorrecto();
        }

        assert(!(tesoroMuyValioso.cumplePaisesNecesarios()));
    }

}

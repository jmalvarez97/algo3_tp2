package edu.fiuba.algo3.Modelardo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class PistaMedia implements Pista{
    String cuerpo;

    public PistaMedia(Edificio edificio, String pista){
        this.cuerpo=pista;
    }
    public PistaMedia(String edificio) {
        this.cuerpo = buscarPorArchivo(edificio);
    }

    @Override
    public String darPista(String dato) {
        return this.cuerpo + dato;
    }

    @Override
    public String buscarPorArchivo(String nombreEdificio) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/pistasFaciles.csv"))) {
            String line;
            Random random = new Random();
            int numRandom;

            // OLOR A ALGO I
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                numRandom = random.nextInt(3);
                if (Objects.equals(values[3], nombreEdificio)) {
                    return values[numRandom];
                }
            }
        } catch (FileNotFoundException ex) {
            return "codesmell";
        } catch (IOException io) {
            return "esto obviamente se puede mejorar";
        }

        return"Seguro debe haber una mejor forma";
    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class PistaFacil implements Pista {
    String cuerpo;

    public PistaFacil(String edificio) {
        this.cuerpo = buscarPorArchivo(edificio);
    }

    @Override
    public String darPista(String dato) {
        return this.cuerpo + dato;
    }


    private String buscarPorArchivo(String nombreEdificio) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/pistasFaciles.csv"))) {
            String line;

            // OLOR A ALGO I
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (Objects.equals(values[1], nombreEdificio)) {
                    return values[0];
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


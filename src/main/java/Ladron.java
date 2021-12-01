import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class Ladron {

    private String sexo;
    private String hobby;
    private String cabello;
    private String senia;
    private String vehiculo;


    public Ladron(String sexo, String hobby, String cabello, String senia, String vehiculo){
        this.sexo = sexo;
        this.hobby = hobby;
        this.cabello = cabello;
        this.senia = senia;
        this.vehiculo = vehiculo;
    }

    // Crea Ladron con datos random leidos de "datosLadron.csv"
    public Ladron(){
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/datosLadron.csv"))) {
            String line;
            Random random = new Random();
            int numRandom;

            // Sexo
            line = br.readline();
            String[] values = line.split(",");
            numRandom = random.nextInt(2);
            this.sexo = values[numRandom];

            // Hobby
            line = br.readline();
            String[] values = line.split(",");
            numRandom = random.nextInt(6);
            this.hobby = values[numRandom];

            // Cabello
            line = br.readline();
            String[] values = line.split(",");
            numRandom = random.nextInt(4);
            this.cabello = values[numRandom];

            // Senia
            line = br.readline();
            String[] values = line.split(",");
            numRandom = random.nextInt(4);
            this.senia = values[numRandom];

            // Vehiculo
            line = br.readline();
            String[] values = line.split(",");
            numRandom = random.nextInt(4);
            this.vehiculo = values[numRandom];

        } catch (FileNotFoundException ex) {
            return "codesmell";
        } catch (IOException io) {
            return "esto obviamente se puede mejorar";
        }

        return"Seguro debe haber una mejor forma";
    }
    }
}

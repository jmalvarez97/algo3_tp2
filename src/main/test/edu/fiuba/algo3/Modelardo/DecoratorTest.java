import edu.fiuba.algo3.Modelardo.Decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    public void testCreoDosLadronesYVeoSuLogicaDeComparacion() {

        Ladron ladron = new Ladron();
        ColorDePelo pelo = new ColorDePelo(ladron,"Rubio");
        Hobby ladronConPeloRubioYJuegaTenis = new Hobby(pelo,"Tenis");


        Ladron ladron2 = new Ladron();
        ColorDePelo pelo2 = new ColorDePelo(ladron2,"Rubio");
        Hobby tenis2 = new Hobby(pelo2,"Tenis");
        Vehiculo ladronConPeloRubioJuegaTenisYTieneLimusina = new Vehiculo(tenis2, "Limusina");


        boolean a = ladronConPeloRubioYJuegaTenis.preguntar("Rubio");
        boolean b = ladronConPeloRubioJuegaTenisYTieneLimusina.preguntar("Convertible");

        assertTrue(a);
        assertFalse(b);
    }

}



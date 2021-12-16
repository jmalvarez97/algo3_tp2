import edu.fiuba.algo3.Decorator.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void testCreoDosLadronesYVeoSuLogicaDeComparacion() {

        LadronBase ladron = new LadronBase();
        PeloRubio pelo = new PeloRubio(ladron);
        Tenis ladronConPeloRubioYJuegaTenis = new Tenis(pelo);


        LadronBase ladron2 = new LadronBase();
        PeloRubio pelo2 = new PeloRubio(ladron2);
        Tenis tenis2 = new Tenis(pelo2);
        Vehiculo ladronConPeloRubioJuegaTenisYTieneLimusina = new Vehiculo(tenis2, "Limusina");


        boolean a = ladronConPeloRubioYJuegaTenis.coinciden(ladronConPeloRubioJuegaTenisYTieneLimusina);

        assert(a);
    }

    @Test
    public void testCreoDosLadronesDistintosPorLoTantoDaFalse(){
        LadronBase ladron = new LadronBase();
        PeloRubio pelo = new PeloRubio(ladron);
        Tenis ladronConPeloRubioYJuegaTenis = new Tenis(pelo);

        LadronBase ladron2 = new LadronBase();
        PeloRojo pelo2 = new PeloRojo(ladron2);
        Tenis ladronConPeloRojoJuegaTenis = new Tenis(pelo2);

        boolean esFalso = ladronConPeloRubioYJuegaTenis.coinciden(ladronConPeloRojoJuegaTenis);
        assertEquals(esFalso,false);
    }
}



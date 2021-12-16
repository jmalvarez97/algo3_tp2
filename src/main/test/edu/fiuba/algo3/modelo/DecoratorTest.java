import edu.fiuba.algo3.Decorator.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void testCreoDosLadronesYVeoSuLogicaDeComparacion() {

        LadronBase ladron = new LadronBase();
        Capa pelo = new Capa(ladron,"Rubio");
        Capa ladronConPeloRubioYJuegaTenis = new Capa(pelo,"Tenis");


        LadronBase ladron2 = new LadronBase();
        Capa pelo2 = new Capa(ladron2,"Rubio");
        Capa tenis2 = new Capa(pelo2,"Tenis");
        Capa ladronConPeloRubioJuegaTenisYTieneLimusina = new Capa(tenis2, "Limusina");


        boolean a = ladronConPeloRubioYJuegaTenis.contiene(ladronConPeloRubioJuegaTenisYTieneLimusina);

        assertEquals(a,true);
    }

    @Test
    public void testCreoDosLadronesDistintosPorLoTantoDaFalse(){
        LadronBase ladron = new LadronBase();
        Capa pelo = new Capa(ladron,"Rubio");
        Capa ladronConPeloRubioYJuegaTenis = new Capa(pelo,"Tenis");


        LadronBase ladron2 = new LadronBase();
        Capa pelo2 = new Capa(ladron2,"False");
        Capa ladronConPeloRojoJuegaTenis = new Capa(pelo2,"Tenis");


        boolean esFalso = ladronConPeloRubioYJuegaTenis.contiene(ladronConPeloRojoJuegaTenis);
        assertEquals(esFalso,false);
    }
}



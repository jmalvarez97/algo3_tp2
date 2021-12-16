import edu.fiuba.algo3.Decorator.LadronBase;
import edu.fiuba.algo3.Decorator.PeloRubio;
import edu.fiuba.algo3.Decorator.Tenis;
import edu.fiuba.algo3.Decorator.Vehiculo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class DecoratorTest {
    @Test
    public void testCreoUnLadronBaseYLeAgregoCaracteristicas(){
        LadronBase ladron = new LadronBase();
        PeloRubio pelo = new PeloRubio(ladron);
        Tenis LadronConPeloRubioYJuegaTenis = new Tenis(pelo);

        ArrayList<String> lista = LadronConPeloRubioYJuegaTenis.misCualidades();
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        assert(true);
    }

    @Test
    public void testCreoUnLadronConElConstructorModificado(){
        LadronBase ladron = new LadronBase();
        PeloRubio pelo = new PeloRubio(ladron);
        Vehiculo ladronConPeloYVehiculo = new Vehiculo(pelo, "Convertible");
        ArrayList<String> lista = ladronConPeloYVehiculo.misCualidades();
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        assert(true);


    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoliciaTest {




    @Test
    public void testLeDescuentoHorasAUnPoliciaNovato(){

        // Todo policia tiene 154 hs
        Policia novato = new Novato();
        novato.descontarHoras(8);

        assertEquals(novato.horasDisponibles(), 154 - 8);


    }
}

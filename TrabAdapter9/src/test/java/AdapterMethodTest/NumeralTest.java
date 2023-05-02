package AdapterMethodTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeralTest {

    @Test
    void deveRetornarNumeralNormal() {
        Numeral numeral = new Numeral();
        numeral.setSistema(10.0f);

        assertEquals(10.0f, numeral.getSistema());
    }

    @Test
    void deveRetornarNumeralRomano() {
        Numeral numeral = new Numeral();
      numeral.setSistema("A");

        assertEquals(9.0f, numeral.getRomano());
    }

}

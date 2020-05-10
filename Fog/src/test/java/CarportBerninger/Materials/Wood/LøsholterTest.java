package CarportBerninger.Materials.Wood;

import junit.framework.TestCase;

public class LøsholterTest extends TestCase {

    public void testGetVareNr() {
        Løsholter løsholter = new Løsholter(700, true);

        assertEquals(54635712, løsholter.getVareNr());
    }
}
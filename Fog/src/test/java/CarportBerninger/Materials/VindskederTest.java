package CarportBerninger.Materials;

import Matrialeliste.Materials.Wood.Vindskeder;
import junit.framework.TestCase;

public class VindskederTest extends TestCase {
    public void testGetLength() {
        Vindskeder vindskeder = new Vindskeder(360,20);

        assertEquals(191.55, vindskeder.getLength());
    }
}
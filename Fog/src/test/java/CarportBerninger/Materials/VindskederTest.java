package CarportBerninger.Materials;

import CarportBerninger.Materials.Vindskeder;
import junit.framework.TestCase;

public class VindskederTest extends TestCase {
    public void testGetLength() {
        Vindskeder vindskeder = new Vindskeder(360,20);

        assertEquals(191.55, vindskeder.getLength());
    }
}
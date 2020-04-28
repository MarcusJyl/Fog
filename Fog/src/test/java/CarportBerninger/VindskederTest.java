package CarportBerninger;

import CarportBerninger.Materials.Vindskeder;
import junit.framework.TestCase;

public class VindskederTest extends TestCase {
    public void testGetLength() {
        Vindskeder vindskeder = new Vindskeder(360,20);

        assertEquals(169.14 * 4, vindskeder.getLength());
    }
}
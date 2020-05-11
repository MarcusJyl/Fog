package CarportBerninger;

import junit.framework.TestCase;

public class SpærTest extends TestCase {

    public void testGetVareNr() {
        Spær spær = new Spær(730,false);

        assertEquals(54475869, spær.getVareNr());
    }
}
package CarportBerninger.Materials;

import junit.framework.TestCase;

public class BrætPåVindskederTest extends TestCase {

    public void testGetLength() {
        BrætPåVindskeder brætPåVindskeder = new BrætPåVindskeder(360,20);

        assertEquals(191.55, brætPåVindskeder.getLength());
    }


}
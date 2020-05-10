package CarportBerninger.Materials.Roof;

import junit.framework.TestCase;

public class RygstenTest extends TestCase {

    public void testGetAmount() {
        Rygsten rygsten = new Rygsten(730);

        assertEquals(21, rygsten.getAmount());
    }
}
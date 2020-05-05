package CarportBerninger.Materials;

import junit.framework.TestCase;

public class BeklædningAfSkurTest extends TestCase {

    public void testGetAmount() {
        BeklædningAfSkur beklædningAfSkur = new BeklædningAfSkur(300, 360, 210);

        assertEquals(189, beklædningAfSkur.getAmount().getAmount());

    }
}
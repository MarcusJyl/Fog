package CarportBerninger.Materials.Roof;

import junit.framework.TestCase;

public class ToplægteHolderTest extends TestCase {

    public void testGetAmount() {
        ToplægteHolder toplægteHolder = new ToplægteHolder(730);

        assertEquals(8, toplægteHolder.getAmount());
    }

}
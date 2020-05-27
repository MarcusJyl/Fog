package CarportBerninger.Materials.Roof;

import Matrialeliste.Materials.Roof.ToplægteHolder;
import junit.framework.TestCase;

public class ToplægteHolderTest extends TestCase {

    public void testGetAmount() {
        ToplægteHolder toplægteHolder = new ToplægteHolder(730);

        assertEquals(8, toplægteHolder.getAmount());
    }

}
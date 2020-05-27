package CarportBerninger.Materials.Wood.FladtTag.BeslagOgSkruer;

import Matrialeliste.Materials.Wood.FladtTag.BeslagOgSkruer.PlastmoBundskruer;
import junit.framework.TestCase;

public class PlastmoBundskruerTest extends TestCase {

    public void testGetAmount() {
        PlastmoBundskruer plastmoBundskruer = new PlastmoBundskruer(780, 600);

        assertEquals(585, plastmoBundskruer.getAmount());
    }
}
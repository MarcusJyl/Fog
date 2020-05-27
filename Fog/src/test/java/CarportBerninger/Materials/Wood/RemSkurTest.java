package CarportBerninger.Materials.Wood;

import Matrialeliste.Materials.Wood.RemSkur;
import junit.framework.TestCase;

public class RemSkurTest extends TestCase {

    public void testGetAmount() {
        RemSkur remSkur = new RemSkur(300, 600);

        assertEquals(3, remSkur.getAmount().getAmount());
    }
}
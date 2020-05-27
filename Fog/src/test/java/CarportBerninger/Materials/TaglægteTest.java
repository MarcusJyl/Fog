package CarportBerninger.Materials;

import Matrialeliste.Materials.Wood.Taglægte;
import junit.framework.TestCase;

public class TaglægteTest extends TestCase {

    public void testGetLength() {
        Taglægte taglægte = new Taglægte(360, 20, 700);

        assertEquals(14, taglægte.getAmount().getAmount());
    }

}
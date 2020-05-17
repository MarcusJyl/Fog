package CarportBerninger.Materials.Wood.FladtTag;

import junit.framework.TestCase;

public class SpærFladtTagTest extends TestCase {

    public void testGetAmount() {
        SpærFladtTag spærFladtTag = new SpærFladtTag(600, 780);

        assertEquals(15, spærFladtTag.getAmount().getAmount());

    }
}
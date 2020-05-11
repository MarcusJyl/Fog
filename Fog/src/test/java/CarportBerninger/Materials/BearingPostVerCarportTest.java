package CarportBerninger.Materials;

import CarportBerninger.Materials.Wood.BearingPostVerCarport;
import junit.framework.TestCase;

public class BearingPostVerCarportTest extends TestCase {

    public void testGetNumberOfPosts() {
        BearingPostVerCarport bearing = new BearingPostVerCarport(500,0,200);

        assertEquals(6, bearing.getNumberOfPosts());
    }

    public void testGetHeigth() {
        BearingPostVerCarport bearing = new BearingPostVerCarport(500,200,200);

        assertEquals(290, bearing.getHeigth());
    }
}
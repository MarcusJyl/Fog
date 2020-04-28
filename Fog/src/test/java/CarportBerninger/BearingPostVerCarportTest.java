package CarportBerninger;

import junit.framework.TestCase;

public class BearingPostVerCarportTest extends TestCase {

    public void testGetNumberOfPosts() {
        BearingPostVerCarport bearing = new BearingPostVerCarport(500,200,200);

        assertEquals(4, bearing.getNumberOfPosts());
    }

    public void testGetHeigth() {
        BearingPostVerCarport bearing = new BearingPostVerCarport(500,200,200);

        assertEquals(290, bearing.getHeigth());
    }
}
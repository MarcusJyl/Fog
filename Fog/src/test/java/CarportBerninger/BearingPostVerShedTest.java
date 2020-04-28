package CarportBerninger;

import junit.framework.TestCase;

public class BearingPostVerShedTest extends TestCase {

    public void testGetNumberOfPosts() {
        BearingPostVerShed bearing = new BearingPostVerShed(500,200,200,600);

        assertEquals(6, bearing.getNumberOfPosts());
    }

    public void testGetHeigth() {
        BearingPostVerShed bearing = new BearingPostVerShed(500,200,200,600);

        assertEquals(290, bearing.getHeigth());
    }
}
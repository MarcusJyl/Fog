package CarportBerninger.Materials.Wood;

import junit.framework.TestCase;

public class SternEnderTest extends TestCase {

    public void testGetSternLength() {
        SternSkur sternEnder = new SternSkur(360);

        assertEquals(360, sternEnder.getSternLength() , 0.1);
    }

}

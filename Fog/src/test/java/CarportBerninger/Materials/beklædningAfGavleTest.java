package CarportBerninger.Materials;

import CarportBerninger.Util.WoodReturn;
import junit.framework.TestCase;

public class beklædningAfGavleTest extends TestCase {

    public void testGetLength() {
        BeklædningAfGavle gavle = new BeklædningAfGavle(360,20);

        assertEquals(65.51, gavle.getLength(),0.1);
    }

    public void testGetAntal() {
        BeklædningAfGavle gavle = new BeklædningAfGavle(360,20);

        assertEquals(39, gavle.getAntal(),0.1);
    }

    public void testGetAmount() {
        BeklædningAfGavle gavle = new BeklædningAfGavle(360,20);
        WoodReturn woodReturn = new WoodReturn(65.51, 39);
        assertEquals(woodReturn.getAmount(), gavle.getAmount().getAmount());
        assertEquals(woodReturn.getLength(), gavle.getAmount().getLength());
    }


}
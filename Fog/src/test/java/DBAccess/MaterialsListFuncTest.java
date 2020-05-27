package DBAccess;

import junit.framework.TestCase;

public class MaterialsListFuncTest extends TestCase {

    public void testGetRoofFromDB() {

        System.out.println(MaterialsListFunc.getRoofFromDB(21548935));

        System.out.println(MaterialsListFunc.getVareNr(22));

        assertEquals(1, 2);
    }
}
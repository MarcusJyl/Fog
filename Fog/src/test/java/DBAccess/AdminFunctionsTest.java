package DBAccess;

import junit.framework.TestCase;

public class AdminFunctionsTest extends TestCase {

    public void testInsertWood() {
        AdminFunctions.insertWood("LOL", 12345678,1,1,1,1, true);
//AdminFunctions.test("Hej", 12312321);
        assertEquals(1,2);
    }

    public void testDeleteWood() {
        AdminFunctions.deleteWood(32);
//AdminFunctions.test("Hej", 12312321);
        assertEquals(32,2);

    }

    public void test() {
    }
}
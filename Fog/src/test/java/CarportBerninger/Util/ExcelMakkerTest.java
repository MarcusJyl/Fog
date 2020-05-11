package CarportBerninger.Util;

import CarportBerninger.Carport;
import junit.framework.TestCase;

import java.io.IOException;

public class ExcelMakkerTest extends TestCase {

    public void testMakeCarport() throws IOException {
        ExcelMakker excelMakker = new ExcelMakker(new Carport(730,360,210,360,220,false,true ,20));

        excelMakker.makeCarport();
    }
}
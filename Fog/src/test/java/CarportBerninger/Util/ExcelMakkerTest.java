package CarportBerninger.Util;

import CarportBerninger.Carport;
import junit.framework.TestCase;

import java.io.IOException;

public class ExcelMakkerTest extends TestCase {

    public void testMakeCarport() throws Exception {
//        ExcelMakker excelMakker = new ExcelMakker(new Carport(730,360,210,360,220,false,true ,20));
//        ExcelMakker excelMakker1 = new ExcelMakker(new Carport(400,360,210,360,220,false,true ,20));
        ExcelMakker excelMakker2 = new ExcelMakker(new Carport(780,360,210,360,220,true,true ,20));

//       excelMakker.makeCarport();
//       excelMakker1.makeCarport();
       excelMakker2.makeCarport();

       assertEquals(1, 2);
    }
}
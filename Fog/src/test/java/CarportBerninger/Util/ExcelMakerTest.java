package CarportBerninger.Util;

import Matrialeliste.Carport;
import Matrialeliste.Materials.Wood.FladtTag.OversternbrædderForenden;
import Matrialeliste.Util.ExcelMaker;
import junit.framework.TestCase;

public class ExcelMakerTest extends TestCase {

    public void testMakeCarport() throws Exception {
//        ExcelMakker excelMakker = new ExcelMakker(new Carport(730,360,210,360,220,false,true ,20));
//        ExcelMakker excelMakker1 = new ExcelMakker(new Carport(400,360,210,360,220,false,true ,20));
        ExcelMaker excelMaker2 = new ExcelMaker(new Carport(780, 360, 210, 25,200,true,true,false,false));
        System.out.println("\n\n\n\n\n\n\n"+ new OversternbrædderForenden(780).getVareNr() + "\n\n\n\n\n\n\n");
//       excelMakker.makeCarport();
//       excelMakker1.makeCarport();
       excelMaker2.makeCarport("Hej", "MArc");

       assertEquals(1, 2);
    }
}
package Matrialeliste;

import DBAccess.MaterialsListFunc;

import java.util.ArrayList;

/**
 * Holder på værdige der ikke skal ændres men skal bruges for skellige steder i programmet
 */
public class StaticValues {
    public static int dictensBetweenSpær = 70;

    //Stoplerne der bære skurent fra jorden af :D
    public static double bærendeStolpeMinAfstand = 150;

    //Stoplerne der bære skurent fra jorden af i skuret :D
    public static int bærendeStolpeMinAntalISkuretLængde = 2;
    public static double bredeForEkstrabærendeStolpe = 250;

    //det overlab der er på hvertbrede i beklædningen
    public static double beklædningsOverlab = 3;

    //bredde af tagsten
    public static double tagstenBredde = 30.5;

    public static double tagpladeBredde = 109;
    public static double tagpladeOverlap = 9;





    public static ArrayList<Integer> VindskederVareNr = MaterialsListFunc.getVareNr(1);
    public static ArrayList<Integer> SternEnderVareNr = MaterialsListFunc.getVareNr(2);
    public static ArrayList<Integer> SternSidreVareNr = MaterialsListFunc.getVareNr(3);
    public static ArrayList<Integer> spær = MaterialsListFunc.getVareNr(4);
    public static ArrayList<Integer> BearingPostVerCarportVareNr = MaterialsListFunc.getVareNr(5);
    public static ArrayList<Integer> BearingPostVerShedVareNr = MaterialsListFunc.getVareNr(5);
    public static ArrayList<Integer> RemCarportVareNr = MaterialsListFunc.getVareNr(6);
    public static ArrayList<Integer> RemSkurVareNr = MaterialsListFunc.getVareNr(7);
    public static ArrayList<Integer> Løsholter1VareNr = MaterialsListFunc.getVareNr(8);
    public static ArrayList<Integer> Løsholter2VareNr = MaterialsListFunc.getVareNr(9);
    public static ArrayList<Integer> BrætPåVindskeder = MaterialsListFunc.getVareNr(10);
    public static ArrayList<Integer> beklædningAfGavleVareNr = MaterialsListFunc.getVareNr(11);
    public static ArrayList<Integer> beklædningAfSkurVareNr = MaterialsListFunc.getVareNr(12);
    public static ArrayList<Integer> ZTilDør = MaterialsListFunc.getVareNr(14);
    public static ArrayList<Integer> BrætTilTagfodslægte = MaterialsListFunc.getVareNr(13);
    public static ArrayList<Integer> Taglægte = MaterialsListFunc.getVareNr(15);
    public static ArrayList<Integer> Toplægte = MaterialsListFunc.getVareNr(16);
    public static ArrayList<Integer> Tagsten = MaterialsListFunc.getVareNr(17);
    public static ArrayList<Integer> rygsten = MaterialsListFunc.getVareNr(18);
    public static ArrayList<Integer> toplægteHolder = MaterialsListFunc.getVareNr(19);
    public static ArrayList<Integer> nakkekrog = MaterialsListFunc.getVareNr(21);
    public static ArrayList<Integer> rygstenBeslag = MaterialsListFunc.getVareNr(20);
    public static ArrayList<Integer> Universalbeslag190mmHøjre = MaterialsListFunc.getVareNr(22);
    public static ArrayList<Integer> Universalbeslag190mmVenstre = MaterialsListFunc.getVareNr(23);
    public static ArrayList<Integer> Stalddørsgreb = MaterialsListFunc.getVareNr(24);
    public static ArrayList<Integer> THængsel = MaterialsListFunc.getVareNr(25);
    public static ArrayList<Integer> vinkelbeslag = MaterialsListFunc.getVareNr(26);
    public static ArrayList<Integer> skruer4_5x60 = MaterialsListFunc.getVareNr(27);
    public static ArrayList<Integer> beslagskruer5x40 = MaterialsListFunc.getVareNr(28);
    public static ArrayList<Integer> skruer5x100 = MaterialsListFunc.getVareNr(29);
    public static ArrayList<Integer> Bræddebolt = MaterialsListFunc.getVareNr(30);
    public static ArrayList<Integer> firkantskiver = MaterialsListFunc.getVareNr(31);
    public static ArrayList<Integer> skruer4_5x070 = MaterialsListFunc.getVareNr(32);
    public static ArrayList<Integer> Skruer4_5x50 =  MaterialsListFunc.getVareNr(33);
    public static ArrayList<Integer> UndersternbrædderEnder =  MaterialsListFunc.getVareNr(34);
    public static ArrayList<Integer> UndersternbrædderSide =  MaterialsListFunc.getVareNr(35);
    public static ArrayList<Integer> OversternbrædderForenden =  MaterialsListFunc.getVareNr(36);
    public static ArrayList<Integer> OversternbrædderSider =  MaterialsListFunc.getVareNr(37);
    public static ArrayList<Integer> VandbrædtSider =  MaterialsListFunc.getVareNr(38);
    public static ArrayList<Integer> VandbrædtForende =  MaterialsListFunc.getVareNr(39);
    public static ArrayList<Integer> SpærFladtTag =  MaterialsListFunc.getVareNr(40);
    public static ArrayList<Integer> Tagplader =  MaterialsListFunc.getVareNr(44);
    public static ArrayList<Integer> PlastmoBundskruer =  MaterialsListFunc.getVareNr(42);
    public static ArrayList<Integer> Hulbånd =  MaterialsListFunc.getVareNr(43);
    public static ArrayList<Integer> Skruer4_5x50Nummer2 =  MaterialsListFunc.getVareNr(44);
}

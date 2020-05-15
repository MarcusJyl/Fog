package CarportBerninger;

import DBAccess.MaterialsListFunc;

import java.util.ArrayList;

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


    //Varenummere
    //4
    public static ArrayList<Integer> spær = MaterialsListFunc.getVareNr(4);
    //2 + 3
    public static ArrayList<Integer> SternEnderVareNr = MaterialsListFunc.getVareNr(2);
    public static ArrayList<Integer> SternSidreVareNr = MaterialsListFunc.getVareNr(3);
    //1
    public static ArrayList<Integer> VindskederVareNr = MaterialsListFunc.getVareNr(1);
    //5
    public static ArrayList<Integer> BearingPostVerCarportVareNr = MaterialsListFunc.getVareNr(5);
    public static ArrayList<Integer> BearingPostVerShedVareNr = MaterialsListFunc.getVareNr(5);
    //6 + 7
    public static ArrayList<Integer> RemCarportVareNr = MaterialsListFunc.getVareNr(6);
    public static ArrayList<Integer> RemSkurVareNr = MaterialsListFunc.getVareNr(7);
    //8+9
    public static ArrayList<Integer> Løsholter1VareNr = MaterialsListFunc.getVareNr(8);
    public static ArrayList<Integer> Løsholter2VareNr = MaterialsListFunc.getVareNr(9);
    //10
    public static ArrayList<Integer> BrætPåVindskeder = MaterialsListFunc.getVareNr(10);
    //11
    public static ArrayList<Integer> beklædningAfGavleVareNr = MaterialsListFunc.getVareNr(11);
    //12
    public static ArrayList<Integer> beklædningAfSkurVareNr = MaterialsListFunc.getVareNr(12);
    //14
    public static ArrayList<Integer> ZTilDør = MaterialsListFunc.getVareNr(14);
    //13
    public static ArrayList<Integer> BrætTilTagfodslægte = MaterialsListFunc.getVareNr(13);
    //15
    public static ArrayList<Integer> Taglægte = MaterialsListFunc.getVareNr(15);
    //16
    public static ArrayList<Integer> Toplægte = MaterialsListFunc.getVareNr(16);
    //17
    public static ArrayList<Integer> Tagsten = MaterialsListFunc.getVareNr(17);
    //18
    public static ArrayList<Integer> rygsten = MaterialsListFunc.getVareNr(18);
    //19
    public static ArrayList<Integer> toplægteHolder = MaterialsListFunc.getVareNr(19);
    //21
    public static ArrayList<Integer> nakkekrog = MaterialsListFunc.getVareNr(21);
    //20
    public static ArrayList<Integer> rygstenBeslag = MaterialsListFunc.getVareNr(20);
    //20
    public static ArrayList<Integer> Universalbeslag190mmHøjre = MaterialsListFunc.getVareNr(22);
    //23
    public static ArrayList<Integer> Universalbeslag190mmVenstre = MaterialsListFunc.getVareNr(23);
    //24
    public static ArrayList<Integer> Stalddørsgreb = MaterialsListFunc.getVareNr(24);
    //25
    public static ArrayList<Integer> THængsel = MaterialsListFunc.getVareNr(25);
    //26
    public static ArrayList<Integer> vinkelbeslag = MaterialsListFunc.getVareNr(26);
    //27
    public static ArrayList<Integer> skruer4_5x60 = MaterialsListFunc.getVareNr(27);
    //28
    public static ArrayList<Integer> beslagskruer5x40 = MaterialsListFunc.getVareNr(28);
    //29
    public static ArrayList<Integer> skruer5x100 = MaterialsListFunc.getVareNr(29);
    //30
    public static ArrayList<Integer> Bræddebolt = MaterialsListFunc.getVareNr(30);
    //31
    public static ArrayList<Integer> firkantskiver = MaterialsListFunc.getVareNr(31);
    // 32
    public static ArrayList<Integer> skruer4_5x070 = MaterialsListFunc.getVareNr(32);
    // 25
    public static ArrayList<Integer> Skruer4_5x50 =  MaterialsListFunc.getVareNr(33);


}

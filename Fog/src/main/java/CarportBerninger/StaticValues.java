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
    public static ArrayList<Integer> SternEnderVareNr =  MaterialsListFunc.getVareNr(2);
    public static ArrayList<Integer> SternSidreVareNr =  MaterialsListFunc.getVareNr(3);
    //1
    public static ArrayList<Integer> VindskederVareNr =  MaterialsListFunc.getVareNr(1);
    //5
    public static ArrayList<Integer> BearingPostVerCarportVareNr =  MaterialsListFunc.getVareNr(5);
    public static ArrayList<Integer> BearingPostVerShedVareNr =  MaterialsListFunc.getVareNr(5);
    //6 + 7
    public static ArrayList<Integer> RemCarportVareNr =  MaterialsListFunc.getVareNr(6);
    public static ArrayList<Integer> RemSkurVareNr =  MaterialsListFunc.getVareNr(7);
    //8+9
    public static ArrayList<Integer> Løsholter1VareNr =  MaterialsListFunc.getVareNr(8);
    public static ArrayList<Integer> Løsholter2VareNr =  MaterialsListFunc.getVareNr(9);
    //10
    public static ArrayList<Integer> BrætPåVindskeder =  MaterialsListFunc.getVareNr(1);
    //11
    public static ArrayList<Integer> beklædningAfGavleVareNr =  MaterialsListFunc.getVareNr(1);
    //12
    public static ArrayList<Integer> beklædningAfSkurVareNr =  MaterialsListFunc.getVareNr(1);
    //14
    public static ArrayList<Integer> ZTilDør =  MaterialsListFunc.getVareNr(1);
    //13
    public static ArrayList<Integer> BrætTilTagfodslægte =  MaterialsListFunc.getVareNr(1);
    //15
    public static ArrayList<Integer> Taglægte =  MaterialsListFunc.getVareNr(1);
    //16
    public static ArrayList<Integer> Toplægte =  MaterialsListFunc.getVareNr(1);
    public static ArrayList<Integer> Tagsten =  MaterialsListFunc.getVareNr(1);
    public static ArrayList<Integer> rygsten =  MaterialsListFunc.getVareNr(1);
    public static ArrayList<Integer> nakkekrog =  MaterialsListFunc.getVareNr(1);



}

package CarportBerninger.Materials.Wood.FladtTag;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class UndersternbrædderEnder extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.UndersternbrædderEnder;
    private double length;
    private int amount = 2;

    public UndersternbrædderEnder(int length) {
        this.length = length;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, amount);
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}

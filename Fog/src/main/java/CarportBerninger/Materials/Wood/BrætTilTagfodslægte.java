package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class BrætTilTagfodslægte extends Wood {


    private ArrayList<Integer> vareNr = StaticValues.BrætTilTagfodslægte;

    private int length;
    private int amount = 2;

    public BrætTilTagfodslægte(int length) {
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

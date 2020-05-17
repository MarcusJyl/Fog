package CarportBerninger.Materials.Wood.FladtTag;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class SpærFladtTag extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.SpærFladtTag;
    private double length;
    private int amount;

    public SpærFladtTag(int width, int length) {
        this.length = width;
        this.amount = (length / 55) + 1;
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

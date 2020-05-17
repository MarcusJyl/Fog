package CarportBerninger.Materials.Wood.FladtTag;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

import static CarportBerninger.StaticValues.tagpladeBredde;
import static CarportBerninger.StaticValues.tagpladeOverlap;

public class Tagplader extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.Tagplader;
    private double length;
    private int amount;

    public Tagplader(int length, int width) {
        this.length = length + 100;
        this.amount = (int)(width / (tagpladeBredde - tagpladeOverlap));
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

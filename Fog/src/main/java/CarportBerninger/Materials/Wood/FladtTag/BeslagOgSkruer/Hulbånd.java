package CarportBerninger.Materials.Wood.FladtTag.BeslagOgSkruer;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Hulbånd extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.Hulbånd;
    private int amount;

    public Hulbånd(int length) {
        this.amount = (int) Math.ceil(length * 2/ 1000.0);
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}

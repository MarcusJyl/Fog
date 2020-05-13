package CarportBerninger.Materials.SkruerOgBeslag;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Universalbeslag190mmVenstre extends ItemsByNumber {

    private int amount;
//    private int vareNr = StaticValues.

    public Universalbeslag190mmVenstre(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return null;
    }
}

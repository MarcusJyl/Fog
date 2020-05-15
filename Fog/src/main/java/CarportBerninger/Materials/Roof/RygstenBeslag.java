package CarportBerninger.Materials.Roof;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class RygstenBeslag extends ItemsByNumber {
    private ArrayList<Integer> vareNr = StaticValues.rygstenBeslag;
    private int amount;

    public RygstenBeslag(int amount) {
        this.amount = amount;
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

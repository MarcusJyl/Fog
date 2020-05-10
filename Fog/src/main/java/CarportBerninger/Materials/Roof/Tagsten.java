package CarportBerninger.Materials.Roof;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Tagsten extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.Tagsten;

    private int amount;
    private double tagstensBredde = StaticValues.tagstenBredde;

    public Tagsten(int lægter, int length) {
        amount = (int) Math.ceil((lægter - 1) * (length / tagstensBredde)* 2);
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

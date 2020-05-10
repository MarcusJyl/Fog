package CarportBerninger.Materials.Roof;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Rygsten extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.rygsten;
    private int amount;

    public Rygsten(int width) {
        this.amount = (width / 100) * 3;
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

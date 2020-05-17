package CarportBerninger.Materials.Wood.FladtTag.BeslagOgSkruer;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class PlastmoBundskruer extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.PlastmoBundskruer;
    private int amount;

    public PlastmoBundskruer(int length, int width) {
        this.amount = (length * width) / 800;
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

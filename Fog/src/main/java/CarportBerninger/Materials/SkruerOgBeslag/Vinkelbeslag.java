package CarportBerninger.Materials.SkruerOgBeslag;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Vinkelbeslag extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.vinkelbeslag;
    private int amount;

    public Vinkelbeslag(int antalStolper) {
        this.amount = antalStolper *2 * 2;
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

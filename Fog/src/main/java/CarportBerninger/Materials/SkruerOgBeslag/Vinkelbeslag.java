package CarportBerninger.Materials.SkruerOgBeslag;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Vinkelbeslag extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.vinkelbeslag;
    private int amount;

    public Vinkelbeslag(int antalStolper) {
        this.amount = antalStolper *2;
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return null;
    }
}

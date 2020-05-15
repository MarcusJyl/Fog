package CarportBerninger.Materials.SkruerOgBeslag;

import CarportBerninger.Materials.Wood.BeklædningAfSkur;
import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Skruer4_5x070 extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.skruer4_5x070;
    private int amount;

    public Skruer4_5x070(BeklædningAfSkur beklædningAfSkur) {
        amount = (int)(beklædningAfSkur.getAmount().getLength() * beklædningAfSkur.getAmount().getAmount())/50;
        System.out.println(vareNr);
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

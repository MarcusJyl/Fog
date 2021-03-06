package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.Materials.Wood.BeklædningAfSkur;
import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class Skruer4_5x070 extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.skruer4_5x070;
    private int amount;

    public Skruer4_5x070(BeklædningAfSkur beklædningAfSkur) {
        amount = (int)(beklædningAfSkur.getAmount().getLength() * beklædningAfSkur.getAmount().getAmount())/50;
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

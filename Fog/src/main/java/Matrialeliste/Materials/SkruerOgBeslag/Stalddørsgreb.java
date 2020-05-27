package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class Stalddørsgreb extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.Stalddørsgreb;
    private int amount = 1;

    public Stalddørsgreb() {
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

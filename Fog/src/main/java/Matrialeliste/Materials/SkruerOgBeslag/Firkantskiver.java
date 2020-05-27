package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class Firkantskiver extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.firkantskiver;
    private int amount;

    public Firkantskiver(Bræddebolt bræddebolt) {
        this.amount = bræddebolt.getAmount();
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

package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

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

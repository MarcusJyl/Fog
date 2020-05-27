package Matrialeliste.Materials.Roof;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class Nakkekrog extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.nakkekrog;
    private int amount;

    public Nakkekrog(int tagstensAntal) {
        this.amount = tagstensAntal;
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

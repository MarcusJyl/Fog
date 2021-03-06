package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class THængsel extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.THængsel;
    private int amount = 2;

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}

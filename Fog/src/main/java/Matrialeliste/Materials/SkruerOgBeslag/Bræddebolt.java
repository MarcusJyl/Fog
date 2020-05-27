package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.Materials.Wood.BearingPostVerCarport;
import Matrialeliste.Materials.Wood.BearingPostVerShed;
import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class Bræddebolt extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.Bræddebolt;
    private int amount;

    public Bræddebolt(BearingPostVerCarport stolpe1, BearingPostVerShed stolpe2) {
        int antalStolper = stolpe1.getAmount().getAmount() + stolpe2.getAmount().getAmount();
        amount = antalStolper * 2 + antalStolper / 2;
    }

    public Bræddebolt(BearingPostVerCarport stolpe1) {
        amount = stolpe1.getAmount().getAmount() * 2 + stolpe1.getAmount().getAmount()/2;
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

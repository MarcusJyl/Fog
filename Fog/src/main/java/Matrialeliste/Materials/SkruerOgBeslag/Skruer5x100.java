package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.Materials.Wood.Taglægte;
import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class Skruer5x100 extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.skruer5x100;
    private int amount;

    public Skruer5x100(Taglægte taglægte) {
        amount = (int) Math.ceil(taglægte.getAmount().getLength() * taglægte.getAmount().getAmount()/100 * 2);
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

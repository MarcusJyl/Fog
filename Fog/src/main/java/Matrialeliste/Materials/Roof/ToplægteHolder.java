package Matrialeliste.Materials.Roof;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class ToplægteHolder extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.toplægteHolder;
    private int amount;

    public ToplægteHolder(int length) {
        int tempLength = length;
        tempLength += 100 - (tempLength%100);

        this.amount = (int) Math.ceil(tempLength/100);
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

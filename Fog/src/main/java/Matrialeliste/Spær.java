package Matrialeliste;

import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class Spær extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.spær;
    private int distanceBetween = StaticValues.dictensBetweenSpær;
    private int antalSpær;

    public Spær(int length, boolean fladRoof) {
        if (!fladRoof) {
            antalSpær= (length / distanceBetween) - 2;
        } else {
            antalSpær= 0;
        }

    }

    @Override
    public int getAmount() {
        return antalSpær;
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}

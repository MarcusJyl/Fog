package Matrialeliste.Materials.Wood;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

public class Rem extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.RemCarportVareNr;
    private int amout = 2;
    private int length;

    public Rem(int length) {
        this.length = length;
    }

    public Rem(int length, int shedLength) {
        this.length = length - shedLength;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, amout);
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}


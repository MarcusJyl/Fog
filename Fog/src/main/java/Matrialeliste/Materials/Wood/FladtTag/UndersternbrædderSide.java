package Matrialeliste.Materials.Wood.FladtTag;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

public class UndersternbrædderSide extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.UndersternbrædderSide;
    private double length;
    private int amount;

    public UndersternbrædderSide(int length) {
        this.length = length;
        this.amount = 2;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, amount);
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}

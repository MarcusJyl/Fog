package Matrialeliste.Materials.Wood.FladtTag;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

public class UndersternbrædderEnder extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.UndersternbrædderEnder;
    private double length;
    private int amount = 2;

    public UndersternbrædderEnder(int length) {
        this.length = length;
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

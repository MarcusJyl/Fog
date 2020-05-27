package Matrialeliste.Materials.Wood;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

public class Toplægte extends Wood {
    private ArrayList<Integer> vareNr = StaticValues.Toplægte;

    private double length;
    private int amount = 1;


    public Toplægte(double length) {
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

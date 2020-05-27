package Matrialeliste.Materials.Wood;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

public class SternCarport extends Wood {
    private ArrayList<Integer> vareNr = StaticValues.SternSidreVareNr;
    private double length;
    private int amount = 2;

    public SternCarport(int length) {
        this.length = length;
    }

    public SternCarport(double length, int shedLength) {
        this.length = length - shedLength;
    }

    public double getSternLength() {
        return length;
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, amount);
    }
}

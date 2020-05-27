package Matrialeliste.Materials.Wood;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

public class SternSkur extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.SternEnderVareNr;
    private double length;
    private int amount = 2;

    public SternSkur(double length) {
        this.length = length;
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

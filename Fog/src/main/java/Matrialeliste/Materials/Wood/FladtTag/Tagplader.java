package Matrialeliste.Materials.Wood.FladtTag;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

import static Matrialeliste.StaticValues.tagpladeBredde;
import static Matrialeliste.StaticValues.tagpladeOverlap;

public class Tagplader extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.Tagplader;
    private double length;
    private int amount;

    public Tagplader(int length, int width) {
        this.length = length + 100;
        this.amount = (int)(width / (tagpladeBredde - tagpladeOverlap));
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

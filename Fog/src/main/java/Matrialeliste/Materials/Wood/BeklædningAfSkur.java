package Matrialeliste.Materials.Wood;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

public class BeklædningAfSkur extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.beklædningAfSkurVareNr;
    //todo gør så bredden her er hente fra vare nummeret.
    private double woodWidth = 10;
    private double overlab = StaticValues.beklædningsOverlab;

    private int amount;
    private double woodLength;
    private double width;

    public BeklædningAfSkur( double length, double width, int height) {
        double tempAmount;
        tempAmount = (length / (woodWidth - overlab)) * 2;
        tempAmount += (width/(woodWidth-overlab)*2);
        amount = (int)Math.ceil(tempAmount);
        woodLength = height;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(woodLength, amount);
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}

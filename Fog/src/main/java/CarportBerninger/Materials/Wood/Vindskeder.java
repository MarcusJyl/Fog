package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class Vindskeder extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.VindskederVareNr;
    private double length;
    private int antal = 4;

    public Vindskeder(int width, int degrees) {
        double radians = Math.toRadians(180 - degrees - degrees);
        double radians2 = Math.toRadians(degrees);
        double widthHalf = width / 2;


        length = Math.round(((Math.sin(radians2)*width)/Math.sin(radians))*100);
        length /= 100;
    }

    public double getLength() {
        return length;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, antal);
    }
}

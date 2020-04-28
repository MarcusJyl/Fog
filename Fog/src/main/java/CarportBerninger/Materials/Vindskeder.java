package CarportBerninger.Materials;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class Vindskeder extends Wood {

    private int vareNr = StaticValues.VindskederVareNr;
    private double length;
    private int antal = 4;

    public Vindskeder(int width, int degrees) {
        double radians = Math.toRadians(180 - 90 - degrees);
        double widthHalf = width / 2;
        length = Math.round((Math.sin(radians)*widthHalf)*100);
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
    public int getVareNr() {
        return vareNr;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, antal);
    }
}

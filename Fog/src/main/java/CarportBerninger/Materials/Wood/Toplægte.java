package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class Toplægte extends Wood {
    private int[] vareNr = StaticValues.Toplægte;

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
    public int[] getVareNr() {
        return vareNr;
    }
}

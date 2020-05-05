package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class Rem extends Wood {

    private int[] vareNr = StaticValues.RemVareNr;
    private int amout = 2;
    private int length;

    public Rem(int length) {
        this.length = length;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, amout);
    }

    @Override
    public int[] getVareNr() {
        return vareNr;
    }
}

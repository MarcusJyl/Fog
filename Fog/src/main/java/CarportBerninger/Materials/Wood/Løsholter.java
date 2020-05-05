package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class Løsholter extends Wood {

    private int[] vareNr = StaticValues.LøsholterVareNr;
    private int amount = 4;
    private int length;

    public Løsholter(int length) {
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

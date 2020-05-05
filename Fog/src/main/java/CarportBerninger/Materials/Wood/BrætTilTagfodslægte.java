package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class BrætTilTagfodslægte extends Wood {


    private int[] vareNr = StaticValues.beklædningAfSkurVareNr;

    private int length;
    private int amount = 2;

    public BrætTilTagfodslægte(int length) {
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

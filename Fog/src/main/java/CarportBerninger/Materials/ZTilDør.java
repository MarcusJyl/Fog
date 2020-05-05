package CarportBerninger.Materials;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class ZTilDør extends Wood {

    private int[] vareNr = StaticValues.ZTilDør;

    private int length = 540;
    private int amount = 1;

    public ZTilDør() {
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

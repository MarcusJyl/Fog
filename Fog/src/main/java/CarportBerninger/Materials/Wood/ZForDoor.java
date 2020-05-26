package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class ZTilDør extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.ZTilDør;

    private int length = 540;
    private int amount = 1;

    public ZTilDør() {
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

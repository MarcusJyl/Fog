package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class Løsholter extends Wood {

    private ArrayList<Integer> vareNr;
    private int amount = 4;
    private int length;

    public Løsholter(int length, boolean erDetTilsiden) {
        this.length = length;
        if (erDetTilsiden){
            vareNr = StaticValues.Løsholter1VareNr;
        } else {
            vareNr = StaticValues.Løsholter2VareNr;
        }
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

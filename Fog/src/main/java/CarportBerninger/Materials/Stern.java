package CarportBerninger.Materials;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class Stern extends Wood {

    private int vareNr = StaticValues.SternVareNr;
    private int sternLength;
    private int amount;

    public Stern(int length, int shedLength) {
        this.sternLength = length - shedLength;
        this.amount = 2;
    }

    public Stern(boolean erDetFladtTag, int width) {
        if (erDetFladtTag){
            this.sternLength = width * 2;
            this.amount = 2;
        } else {
            this.sternLength = 0;
            this.amount = 0;
        }
    }

    public int getSternLength() {
        return sternLength;
    }

    @Override
    public int getVareNr() {
        return vareNr;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(sternLength, 1);
    }
}

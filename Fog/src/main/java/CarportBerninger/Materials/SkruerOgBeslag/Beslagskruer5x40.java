package CarportBerninger.Materials.SkruerOgBeslag;

import CarportBerninger.Materials.Wood.Toplægte;
import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Beslagskruer5x40 extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.beslagskruer5x40;
    private int amount;

    public Beslagskruer5x40(Toplægte toplægte, int spærAntal) {
        amount = (int) Math.ceil((toplægte.getAmount().getLength() /100)* 2) + spærAntal * 2 * 10;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}

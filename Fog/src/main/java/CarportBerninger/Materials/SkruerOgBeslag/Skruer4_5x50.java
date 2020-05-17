package CarportBerninger.Materials.SkruerOgBeslag;

import CarportBerninger.Materials.Wood.BeklædningAfGavle;
import CarportBerninger.Materials.Wood.FladtTag.BeslagOgSkruer.Hulbånd;
import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Skruer4_5x50 extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.Skruer4_5x50;
    private int amount;

    public Skruer4_5x50(BeklædningAfGavle beklædning) {
        amount = (int)((beklædning.getAmount().getLength() * beklædning.getAmount().getAmount()) / 25);
    }
    public Skruer4_5x50(Skruer4_5x070 skrue) {
        amount = (int) (skrue.getAmount() * 0.8);
    }

    public Skruer4_5x50(Hulbånd hulbånd, Universalbeslag190mmHøjre uni) {
        this.amount = ((uni.getAmount() * 2) * 8) + (hulbånd.getAmount() * 40);
        vareNr = StaticValues.Skruer4_5x50Nummer2;
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

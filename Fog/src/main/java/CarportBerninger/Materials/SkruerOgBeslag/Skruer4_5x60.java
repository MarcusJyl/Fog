package CarportBerninger.Materials.SkruerOgBeslag;

import CarportBerninger.Materials.Wood.BrætPåVindskeder;
import CarportBerninger.Materials.Wood.SternCarport;
import CarportBerninger.Materials.Wood.SternSkur;
import CarportBerninger.Materials.Wood.Vindskeder;
import CarportBerninger.StaticValues;
import CarportBerninger.Util.ItemsByNumber;

import java.util.ArrayList;

public class Skruer4_5x60 extends ItemsByNumber {

    private ArrayList<Integer> vareNr = StaticValues.skruer4_5x60;
    private int amount;

    public Skruer4_5x60(SternSkur sternSkur, SternCarport sternCarport, Vindskeder vindskeder, BrætPåVindskeder brætPåVindskeder) {
        amount = (int)( sternCarport.getAmount().getLength() * sternCarport.getAmount().getAmount() +
                        sternSkur.getAmount().getLength() * sternSkur.getAmount().getAmount() +
                        vindskeder.getAmount().getLength() * vindskeder.getAmount().getAmount() +
                        brætPåVindskeder.getAmount().getLength() * brætPåVindskeder.getAmount().getAmount())/15;
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

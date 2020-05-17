package CarportBerninger.Materials.SkruerOgBeslag;

import CarportBerninger.Materials.Wood.BrætPåVindskeder;
import CarportBerninger.Materials.Wood.FladtTag.VandbrædtForende;
import CarportBerninger.Materials.Wood.FladtTag.VandbrædtSider;
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

    public Skruer4_5x60(SternCarport sternCarport, SternSkur sternSkur, VandbrædtForende vandbrædtForende, VandbrædtSider vandbrædtSider) {
        this.amount = (int)(sternCarport.getAmount().getLength() + sternSkur.getAmount().getLength() + vandbrædtForende.getAmount().getLength() + vandbrædtSider.getAmount().getLength()) / 15;
    }

    public Skruer4_5x60(SternCarport sternCarport, VandbrædtForende vandbrædtForende, VandbrædtSider vandbrædtSider) {
        this.amount = (int)(sternCarport.getAmount().getLength() + vandbrædtForende.getAmount().getLength() + vandbrædtSider.getAmount().getLength())/15;

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

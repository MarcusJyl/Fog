package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.Materials.Wood.BrætPåVindskeder;
import Matrialeliste.Materials.Wood.FladtTag.VandbrædtForende;
import Matrialeliste.Materials.Wood.FladtTag.VandbrædtSider;
import Matrialeliste.Materials.Wood.SternCarport;
import Matrialeliste.Materials.Wood.SternSkur;
import Matrialeliste.Materials.Wood.Vindskeder;
import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

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

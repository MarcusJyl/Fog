package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.Materials.Wood.FladtTag.SpærFladtTag;
import Matrialeliste.Spær;
import Matrialeliste.StaticValues;
import Matrialeliste.Util.ItemsByNumber;

import java.util.ArrayList;

public class Universalbeslag190mmVenstre extends ItemsByNumber {

    private int amount;
    private ArrayList<Integer> vareNr = StaticValues.Universalbeslag190mmVenstre;

    public Universalbeslag190mmVenstre(Spær spær) {
        this.amount = spær.getAmount();
    }

    public Universalbeslag190mmVenstre(SpærFladtTag spærFladtTag) {
        this.amount = spærFladtTag.getAmount().getAmount();
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

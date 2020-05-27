package Matrialeliste.Materials.SkruerOgBeslag;

import Matrialeliste.Materials.Wood.FladtTag.SpærFladtTag;
import Matrialeliste.Spær;
import Matrialeliste.StaticValues;

import java.util.ArrayList;

public class Universalbeslag190mmHøjre extends Universalbeslag190mmVenstre {

    private ArrayList<Integer> vareNr = StaticValues.Universalbeslag190mmHøjre;

    public Universalbeslag190mmHøjre(Spær spær) {
        super(spær);
    }

    public Universalbeslag190mmHøjre(SpærFladtTag spærFladtTag) {
        super(spærFladtTag);
    }
}

package CarportBerninger.Materials.SkruerOgBeslag;

import CarportBerninger.Materials.Wood.FladtTag.SpærFladtTag;
import CarportBerninger.Spær;
import CarportBerninger.StaticValues;

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

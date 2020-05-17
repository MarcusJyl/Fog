package CarportBerninger.Materials.Wood.FladtTag;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class OversternbrædderForenden extends UndersternbrædderEnder{

    private ArrayList<Integer> vareNr = StaticValues.OversternbrædderForenden;
    private int amount = 1;

    public OversternbrædderForenden(int length) {
        super(length);
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(super.getAmount().getLength(), amount);
    }
}

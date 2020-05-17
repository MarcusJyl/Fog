package CarportBerninger.Materials.Wood.FladtTag;

import CarportBerninger.StaticValues;

import java.util.ArrayList;

public class VandbrædtSider extends  UndersternbrædderSide {

    private ArrayList<Integer> vareNr = StaticValues.VandbrædtSider;
    private int amount = 1;

    public VandbrædtSider(int length) {
        super(length);
    }
}

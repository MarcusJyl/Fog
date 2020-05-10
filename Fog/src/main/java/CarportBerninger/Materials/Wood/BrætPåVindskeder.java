package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;

import java.util.ArrayList;

public class BrætPåVindskeder extends Vindskeder {

    private ArrayList<Integer> vareNr = StaticValues.BrætPåVindskeder;

    public BrætPåVindskeder(int width, int degrees) {
        super(width, degrees);
    }
}

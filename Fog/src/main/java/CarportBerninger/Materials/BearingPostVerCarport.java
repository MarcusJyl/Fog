package CarportBerninger.Materials;

import CarportBerninger.Util.Material;
import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class BearingPostVerCarport extends Wood {

    private int[] vareNr = StaticValues.BearingPostVerCarportVareNr;
    private final double distance = StaticValues.bærendeStolpeMinAfstand;

    private int numberOfPosts;
    private int heigth;

    public BearingPostVerCarport(int length, int shedLength, int heigth) {
        this.heigth = heigth + 90;
        int acualLength = length - shedLength;

        numberOfPosts = (int)((acualLength-(acualLength % distance)) / distance) * 2;
    }

    public int getNumberOfPosts(){
        return numberOfPosts;
    }
    public int getHeigth() {
        return heigth;
    }

    @Override
    public int[] getVareNr() {
        return vareNr;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(heigth, numberOfPosts);
    }
}

package CarportBerninger.Materials.Wood;

import CarportBerninger.Util.Material;
import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class BearingPostVerCarport extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.BearingPostVerCarportVareNr;
    private final double distance = StaticValues.bærendeStolpeMinAfstand;

    private int numberOfPosts;
    private int heigth;

    public BearingPostVerCarport(int length, int shedLength, int heigth) {
        this.heigth = heigth + 90;
        int acualLength = length - shedLength;

        numberOfPosts = (int)((acualLength-(acualLength % distance)) / distance) * 2;
    }

    public BearingPostVerCarport(int length, int heigth) {
        this.heigth = heigth + 90;

        numberOfPosts = (int)((length-(length % distance)) / distance) * 2;
    }

    public int getNumberOfPosts(){
        return numberOfPosts;
    }
    public int getHeigth() {
        return heigth;
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(heigth, numberOfPosts);
    }
}

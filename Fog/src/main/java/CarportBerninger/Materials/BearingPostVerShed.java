package CarportBerninger.Materials;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class BearingPostVerShed extends Wood {

    private int vareNr = StaticValues.BearingPostVerShedVareNr;
    private final double distance = StaticValues.bærendeStolpeMinAfstand;

    private int numberOfPosts;
    private int heigth;

    public BearingPostVerShed(int length, int shedLength, int heigth, int width) {
        this.heigth = heigth + 90;
        int acualLength = length - shedLength;

        int tempNumPosts = (int)((acualLength-(acualLength % distance)) / distance);
        if (tempNumPosts <= StaticValues.bærendeStolpeMinAntalISkuretLængde) {
            numberOfPosts = StaticValues.bærendeStolpeMinAntalISkuretLængde;
        } else {
            numberOfPosts = tempNumPosts;
        }
        int i = 2;
        while(width > StaticValues.bredeForEkstrabærendeStolpe * i){
            i++;
        }
        numberOfPosts *= i;
    }

    public int getNumberOfPosts(){
        return numberOfPosts;
    }
    public int getHeigth() {
        return heigth;
    }

    @Override
    public int getVareNr() {
        return vareNr;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(heigth, numberOfPosts);
    }
}

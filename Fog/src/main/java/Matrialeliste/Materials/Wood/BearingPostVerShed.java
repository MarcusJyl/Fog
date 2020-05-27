package Matrialeliste.Materials.Wood;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

public class BearingPostVerShed extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.BearingPostVerShedVareNr;
    private final double distance = StaticValues.bærendeStolpeMinAfstand;

    private int numberOfPosts;
    private int heigth;

    public BearingPostVerShed( int shedLength, int heigth, int width) {
        this.heigth = heigth + 90;

        numberOfPosts = 1;
        int q = 2;
        while(shedLength > StaticValues.bredeForEkstrabærendeStolpe * q){
            q++;
        }
        numberOfPosts *= q;


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
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(heigth, numberOfPosts);
    }
}

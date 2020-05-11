package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class RemSkur extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.RemSkurVareNr;
    private int amout = 2;
    private int length;

    public RemSkur(int length, int width) {
        this.length = length;

        int i = 2;
        while(width > StaticValues.bredeForEkstrabærendeStolpe * i){
            i++;
        }
        amout = i;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, amout);
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}

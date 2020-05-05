package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

public class Taglægte extends Wood {

    private int[] vareNr = StaticValues.Taglægte;

    private double length;
    private int amount;
    private  int width;


    public Taglægte(int width, int degrees, int length) {
        this.length = length;
        this.width = width / 2;
        double roofLength;
        double tempAmount = 1;
        double radians = Math.toRadians(180 - degrees - degrees);
        double radians2 = Math.toRadians(degrees);
        roofLength = Math.round(((Math.sin(radians2)*width)/Math.sin(radians))*100);
        roofLength /= 100;


        roofLength = roofLength - 3.0;
        tempAmount += roofLength/30.7;
        tempAmount *= 2;
        this.amount = (int)tempAmount;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, amount);
    }

    @Override
    public int[] getVareNr() {
        return vareNr;
    }
}

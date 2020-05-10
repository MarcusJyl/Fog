package CarportBerninger.Materials.Wood;

import CarportBerninger.StaticValues;
import CarportBerninger.Util.Wood;
import CarportBerninger.Util.WoodReturn;

import java.util.ArrayList;

public class BeklædningAfGavle extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.beklædningAfGavleVareNr;
    //todo gør så bredden her er hente fra vare nummeret.
    private double WoodWidth = 10;
    private double overlab = StaticValues.beklædningsOverlab;

    private int amount;
    private double length;
    private double width;

    public BeklædningAfGavle(int width, int degrees) {
        double tempAmount = 1;
        this.width = width / 2;
        double radians = Math.toRadians(degrees);
        double radians2 = Math.toRadians(180 - degrees - 90);
        this.length = Math.round(((Math.sin(radians) * this.width) / Math.sin(radians2)) * 100);
        this.length /= 100;


        this.width -= ((WoodWidth - overlab) / 2);

        while (this.width > 0) {
            double tempLength = (Math.sin(radians) * this.width) / Math.sin(radians2);
            if (tempLength > length / 2) {
                tempAmount++;
            } else {
                tempAmount += 0.5;
            }
            this.width -= (WoodWidth - overlab);
        }
        amount =(int) ((tempAmount - 1) * 2);
    }

    public double getAntal(){
        return amount;
    }


    public double getLength() {
        return length;
    }

    @Override
    public WoodReturn getAmount() {
        return new WoodReturn(length, amount);
    }

    @Override
    public ArrayList<Integer> getVareNr() {
        return vareNr;
    }
}

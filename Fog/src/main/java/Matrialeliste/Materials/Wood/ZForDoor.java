package Matrialeliste.Materials.Wood;

import Matrialeliste.StaticValues;
import Matrialeliste.Util.Wood;
import Matrialeliste.Util.WoodReturn;

import java.util.ArrayList;

public class ZForDoor extends Wood {

    private ArrayList<Integer> vareNr = StaticValues.ZTilDør;

    private int length = 540;
    private int amount = 1;

    public ZForDoor() {
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

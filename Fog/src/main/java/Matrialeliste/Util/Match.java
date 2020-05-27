package Matrialeliste.Util;

import DBAccess.MaterialsListFunc;

import java.util.HashMap;
import java.util.Map;

/**
 * Prøver at finde den kombination af træ stykker der giver mindst spild
 */

public class Match {

    public static HashMap<Integer, Integer> wood(Wood wood) {

        double woodLength = wood.getAmount().getLength();

        int antal = wood.getAmount().getAmount();

        int entryNum = 0;


        HashMap<Integer, Integer> bestMatchVareNr = new HashMap<>();

        for (Integer in : wood.getVareNr()) {
            bestMatchVareNr.put(in, 0);
        }

        while (antal > 0) {
            int antalBrugt = 0;
            double waste = 10000000;

            for (Map.Entry entry : bestMatchVareNr.entrySet()) {
                int length = MaterialsListFunc.getWoodLength((int) entry.getKey());

                for (int i = 0; i < antal; i++) {
                    double res = length - (woodLength * (i + 1));
                    if (waste > res && res >= 0) {
                        waste = res;
                        antalBrugt = i + 1;
                        entryNum = (int)entry.getKey();
                    }
                }
            }
            if (waste == 10000000) {
                woodLength = woodLength / 2;
                antal *= 2;
            } else {
                antal -= antalBrugt;
                bestMatchVareNr.replace(entryNum, bestMatchVareNr.get(entryNum) + 1);
            }

        }

        return bestMatchVareNr;
    }

}

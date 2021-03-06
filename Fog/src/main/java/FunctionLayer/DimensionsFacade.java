package FunctionLayer;

import DBAccess.Datamapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Klassen indholder methoder der henter diminisioner fra databasen og sender dem til frontenden
 */

public class DimensionsFacade {

    public static int width = 0;

    public static ArrayList<Integer> getHeight(){

        return Datamapper.GetHeight();
    }

    public static ArrayList<Integer> getWidth(){

        return Datamapper.GetWidth();
    }
    public static ArrayList<Integer> getWidthWhitMax(int max){
        return Datamapper.GetWidth();
    }

    public static ArrayList<Integer> getLength(){

        return Datamapper.GetLength();
    }

    public static ArrayList<Integer> getSlope() {

        return Datamapper.GetSlope();
    }
    public static  ArrayList<String> getAllRoof(){

        return Datamapper.GetAllRoof();
    }
    public static  ArrayList<String> getAllWoodPanels(){

        return Datamapper.GetWoodPanels();
    }
    public static  ArrayList<String> getAllFlooring(){

        return Datamapper.GetFlooring();
    }
}

package FunctionLayer;

import DBAccess.Datamapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DimensionsFacade {

    public static int width = 0;

    public static ArrayList<Integer> getHeight(){

        return Datamapper.GetHeight();
    }

    public static ArrayList<Integer> getWidth(){

        return Datamapper.GetWidth();
    }
    public static ArrayList<Integer> getWidthWhitMax(int max){
        System.out.println("dasdasdasd");
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

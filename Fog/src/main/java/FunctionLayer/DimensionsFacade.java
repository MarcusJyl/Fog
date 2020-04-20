package FunctionLayer;

import DBAccess.Datamapper;

import java.util.ArrayList;
import java.util.List;

public class DimensionsFacade {

    public static ArrayList<Integer> getHeight(){
        System.out.println(Datamapper.GetHeight());
        return Datamapper.GetHeight();
    }

    public static ArrayList<Integer> getWidth(){
        ArrayList<Integer> list = new ArrayList<>();

        return Datamapper.GetWidth();
    }

    public static ArrayList<Integer> getLength(){
        ArrayList<Integer> list = new ArrayList<>();

        return Datamapper.GetLength();
    }

    public static ArrayList<Integer> getSlope() {
        ArrayList<Integer> list = new ArrayList<>();

        return Datamapper.GetSlope();
    }
    public static  ArrayList<String> getAllRoof(){
        ArrayList<String> list = new ArrayList<>();

        return Datamapper.GetAllRoof();
    }
    public static  ArrayList<String> getAllWoodPanels(){
        ArrayList<String> list = new ArrayList<>();

        return Datamapper.GetWoodPanels();
    }
    public static  ArrayList<String> getAllFlooring(){
        ArrayList<String> list = new ArrayList<>();

        return Datamapper.GetFlooring();
    }
}

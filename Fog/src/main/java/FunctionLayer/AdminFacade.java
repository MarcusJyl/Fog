package FunctionLayer;

import DBAccess.AdminFunctions;

import java.util.ArrayList;

/**
 * Methoder der hente data fra databasen og sender det til frontenden
 */

public class AdminFacade {

    public static ArrayList<WoodWhitPrice> getAllWood(){
        return AdminFunctions.selectAllWood();
    }

    public static void updateWoodPrice(int id, double val){
        AdminFunctions.updateWoodPrice(id, val);
    }

    public static ArrayList<String> getAllWoodNames(){
        return AdminFunctions.selectAllWoodNames();
    }

    public static WoodWhitPrice getWoodByName(String name){
        return AdminFunctions.selectWoodByName(name);
    }

}

package FunctionLayer;

import DBAccess.AdminFunctions;

import java.util.ArrayList;

public class AdminFacade {

    public static ArrayList<WoodWhitPrice> getAllWood(){
        return AdminFunctions.selectAllWood();
    }

    public static void updateWoodPrice(int id, double val){
        AdminFunctions.updateWoodPrice(id, val);
    }

}

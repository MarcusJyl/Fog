package DBAccess;

import FunctionLayer.WoodWhitPrice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MaterialsListFunc {
    public static ArrayList<Integer> getVareNr(int id) {
        ArrayList<Integer> vareNummere = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM inventory.produktNumber inner JOIN inventory.produkter_til_carport ON produkter_til_carport.id=produktNumber.id where produkter_til_carport.produktId = (SELECT produktId FROM inventory.produkter_til_carport where id=?) ;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int vareNr = rs.getInt("produktNumber");
                vareNummere.add(vareNr);
            }
            return vareNummere;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

package DBAccess;

import Matrialeliste.Util.BeslagFromDB;
import Matrialeliste.Util.RoofFromDB;
import Matrialeliste.Util.WoodFromDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Denne classe inholder alle sql kald som pogramet bruger for at lave matrialelisten.
 */

public class MaterialsListFunc {
    public static ArrayList<Integer> getVareNr(int id) {
        ArrayList<Integer> vareNummere = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM inventory.produktNumber where produktId=(SELECT produktId FROM inventory.produkter_til_carport where id=?);";
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

    public static ArrayList<Integer> getWood(int vareNummer) {
        ArrayList<Integer> vareNummere = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT produktNumber FROM inventory.produktNumber inner JOIN inventory.produkter_til_carport ON produkter_til_carport.id=produktNumber.id where produkter_til_carport.produktId = (SELECT produktId FROM inventory.produkter_til_carport where id=?) ;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, vareNummer);
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

    public static int getWoodLength(int vareNummer) {
        int length = 0;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT træ_længde as længde FROM inventory.produkt_træ inner join inventory.produktNumber on produkt_træ.id = produktNumber.id where produktNumber = ?;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, vareNummer);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                length = rs.getInt("længde");
            }
            return length;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static WoodFromDB getAllWoodInfo(int vareNummer) {
        WoodFromDB woodFromDB = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM inventory.produkt_træ inner join produkt on produkt_træ.produktId = produkt.produktId where id = (select id from inventory.produktNumber where produktNumber = ?);";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, vareNummer);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int produktId = rs.getInt("produktId");
                int længde = rs.getInt("træ_længde");
                int bredde = rs.getInt("træ_bredde");
                int dypde = rs.getInt("træ_dypde");
                int meterpris = rs.getInt("meterpris");
                String name = rs.getString("produktName");
                woodFromDB = new WoodFromDB(id, produktId, længde, bredde, dypde, meterpris, name);
            }
            return woodFromDB;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getDescription (int id) {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT kommentar FROM inventory.produkter_til_carport where produktId = ?;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String text = rs.getString("kommentar");
                return text;
            }
            return null;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static RoofFromDB getRoofFromDB(int vareNummer) {
        RoofFromDB roofFromDB = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM inventory.produkt_tagpakken inner join produkt on produkt_tagpakken.produktId = produkt.produktId where id = (select id from inventory.produktNumber where produktNumber = ?);";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, vareNummer);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int produktId = rs.getInt("produktId");
                double pris = rs.getDouble("pris");
                String name = rs.getString("produktName");
                roofFromDB = new RoofFromDB(id,produktId, pris, name);
            }
            return roofFromDB;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BeslagFromDB getBeslagFromDB(int vareNummer) {
        BeslagFromDB beslagFromDB = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM inventory.produkt_beslag_skruer inner join produkt on produkt_beslag_skruer.produktId = produkt.produktId where id = (select id from inventory.produktNumber where produktNumber = ?);";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, vareNummer);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int produktId = rs.getInt("produktId");
                double pris = rs.getDouble("pris");
                String name = rs.getString("produktName");
                int antal = rs.getInt("antal");
                beslagFromDB = new BeslagFromDB(id,produktId, pris, name, antal);

            }
            return beslagFromDB;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

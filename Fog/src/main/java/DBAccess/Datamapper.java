package DBAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Denne classe bruges til at hente data fra databasen og alt det benyttes på bruger siden
 */

public class Datamapper {


    public static ArrayList<Integer> GetHeight() {
        ArrayList<Integer> allHeight = new ArrayList<Integer>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT height FROM `height`;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int height = rs.getInt("height");
                allHeight.add(height);
            }
            return allHeight;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Integer> GetLength() {
        ArrayList<Integer> allLength = new ArrayList<Integer>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT length FROM `length`;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int length = rs.getInt("length");
                allLength.add(length);
            }
            return allLength;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Integer> GetWidth() {
        ArrayList<Integer> allWidth = new ArrayList<Integer>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT width FROM `width`;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int width = rs.getInt("width");
                allWidth.add(width);
            }
            return allWidth;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Integer> GetSlope() {
        ArrayList<Integer> allSlope = new ArrayList<Integer>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT slope FROM `slope`;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int slope = rs.getInt("slope");
                allSlope.add(slope);
            }
            return allSlope;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<String> GetAllRoof() {
        ArrayList<String> allRoofTypes = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "Select roof_type.name, roof_color.color from ((roof inner join roof_type on roof.type_id = roof_type.id) inner join roof_color on roof.color_id = roof_color.id);";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String color = rs.getString("color");
                String roof = name + " - " + color;
                allRoofTypes.add(roof);
            }
            return allRoofTypes;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<String> GetWoodPanels() {
        ArrayList<String> allWoodPanels = new ArrayList<String>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT beklædning_type FROM `beklædning`;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String beklædning = rs.getString("beklædning_type");
                allWoodPanels.add(beklædning);
            }
            return allWoodPanels;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static ArrayList<String> GetFlooring() {
        ArrayList<String> allFlooring = new ArrayList<String>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT floor_type FROM `floor`;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String floor = rs.getString("floor_type");
                allFlooring.add(floor);
            }
            return allFlooring;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

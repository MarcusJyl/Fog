package DBAccess;

import FunctionLayer.Wood;
import FunctionLayer.WoodWhitPrice;

import java.sql.*;
import java.util.ArrayList;

public class AdminFunctions {

    public static int InsertHeight(int height) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO height (height) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, height);
            preparedStatement.executeUpdate();
            return height;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return height;
    }


    public static void RemoveHeight(int height) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM height WHERE height = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, height);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static int InsertLength(int length) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO length (length) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, length);
            preparedStatement.executeUpdate();
            return length;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return length;
    }

    public static void RemoveLength(int length) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM length WHERE length = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, length);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static int InsertWidth(int width) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO width (width) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, width);
            preparedStatement.executeUpdate();
            return width;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return width;
    }


    public static void RemoveWidth(int width) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM width WHERE width = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, width);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static int InsertSlope(int slope) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO slope (slope) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, slope);
            preparedStatement.executeUpdate();
            return slope;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return slope;
    }

    public static void RemoveSlope(int slope) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM slope WHERE slope = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, slope);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static int InsertShedLength(int length) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO skur_length (skur_length) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, length);
            preparedStatement.executeUpdate();
            return length;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return length;
    }


    public static void RemoveShedLength(int length) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM skur_length WHERE skur_length = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, length);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static int InsertShedWidth(int width) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO skur_width (skur_width) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, width);
            preparedStatement.executeUpdate();
            return width;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return width;
    }


    public static void RemoveShedWidth(int width) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM skur_width WHERE skur_width = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, width);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static String InsertBekladning(String bekladning) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO beklædning (beklædning_type) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, bekladning);
            preparedStatement.executeUpdate();
            return bekladning;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bekladning;
    }


    public static void RemoveBekladning(String bekladning) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM beklædning WHERE beklædning_type = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, bekladning);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static String InsertFloor(String floor) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO floor (floor_type) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, floor);
            preparedStatement.executeUpdate();
            return floor;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return floor;
    }


    public static void RemoveFloor(String floor) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM floor WHERE floor_type = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, floor);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static String InsertColor(String color) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO roof_color (color) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, color);
            preparedStatement.executeUpdate();
            return color;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return color;
    }


    public static void RemoveColor(String color) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM roof_color WHERE color = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, color);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static String InsertRoof(String roof) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO roof_type (name) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, roof);
            preparedStatement.executeUpdate();
            return roof;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return roof;
    }


    public static void RemoveRoof(String roof) {
        try {
            Connection con = Connector.connection();
            String SQL = "DELETE FROM roof_type WHERE name = (?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, roof);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<WoodWhitPrice> selectAllWood() {
        ArrayList<WoodWhitPrice> allHeight = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM inventory.produktnumber inner JOIN inventory.produkt_træ ON produktnumber.id=produkt_træ.id inner JOIN inventory.produkt ON produktnumber.produktId=produkt.produktId;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                double bredde = rs.getDouble("træ_bredde");
                double lægde = rs.getDouble("træ_længde");
                double dypde = rs.getDouble("træ_dypde");
                int produktnummer = rs.getInt("produktNumber");
                double meterpris = rs.getDouble("meterpris");
                String produktNavn = rs.getString("produktName");
                WoodWhitPrice tempWood = new WoodWhitPrice(id, bredde, lægde, dypde, meterpris, produktnummer, produktNavn);
                allHeight.add(tempWood);
            }
            return allHeight;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<String> selectAllWoodNames() {
        ArrayList<String> allHeight = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT DISTINCT produktName FROM produkt inner JOIN inventory.produkt_træ ON produkt.produktId=produkt_træ.produktId;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String produktNavn = rs.getString("produktName");
                allHeight.add(produktNavn);
            }
            return allHeight;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static WoodWhitPrice selectWoodByName(String name) {
        WoodWhitPrice wood = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM inventory.produkt_træ where produktId = (select produktId from produkt where produktName = ? LIMIT 1) ;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                double bredde = rs.getDouble("træ_bredde");
                double lægde = rs.getDouble("træ_længde");
                double dypde = rs.getDouble("træ_dypde");
                double meterpris = rs.getDouble("meterpris");
                wood = new WoodWhitPrice(id, bredde, lægde, dypde, meterpris);
                return wood;
            }
            return null;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void updateWoodPrice(int id, double price) {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE inventory.produkt_træ SET meterpris = ? WHERE id=?; ";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setDouble(1, price);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void deleteWood(int id) {
        int count = 0;
        try {
            Connection con = Connector.connection();
            String SQL = "delete from produkt_træ where id = ?;";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            Connection con1 = Connector.connection();
            String SQL1 = "delete from produktnumber where id = ?;";
            PreparedStatement preparedStatement1 = con1.prepareStatement(SQL1, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement1.setInt(1, id);
            preparedStatement1.executeUpdate();

            Connection con2 = Connector.connection();
            String SQL2 = "select count(id) as count from produktnumber where produktId = (select produktId from produktnumber where id = ?);";
            PreparedStatement preparedStatement2 = con2.prepareStatement(SQL2);
            preparedStatement2.setInt(1, id);
            ResultSet rs = preparedStatement2.executeQuery();
            while (rs.next()) {
                count = rs.getInt("count");
            }

            if (count == 0){
                System.out.println("hej");
                Connection con4 = Connector.connection();
                String SQL4 = "delete from produkt where produktId = (select produktId from produktnumber where id = ?);";
                PreparedStatement preparedStatement4 = con4.prepareStatement(SQL4, PreparedStatement.RETURN_GENERATED_KEYS);
                preparedStatement4.setInt(1, id);
                preparedStatement4.executeUpdate();
            }

            System.out.println(count);



        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void insertWood(String navn, int vareNr, double længde, double bredde, double dybde, double pris, boolean newName) {
        try {
            int produktId = 0;
            if (newName){
                Connection con = Connector.connection();
                String SQL = "insert into produkt(produktName) value(?) ";
                PreparedStatement ps = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, navn);
                ps.executeUpdate();
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                produktId = ids.getInt(1);
                System.out.println(produktId);
            } else {
                Connection con = Connector.connection();
                String SQL = "select produktId from produkt where produktName = ?";
                PreparedStatement preparedStatement = con.prepareStatement(SQL);
                preparedStatement.setString(1, navn);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    produktId = rs.getInt("produktId");
                }
            }



            Connection con2 = Connector.connection();
            String SQL2 = "insert into produktNumber(produktId, produktNumber) value (?,?); ";
            PreparedStatement ps2 = con2.prepareStatement(SQL2, PreparedStatement.RETURN_GENERATED_KEYS);
            ps2.setInt(1, produktId);
            ps2.setInt(2, vareNr);
            ps2.executeUpdate();
            ResultSet ids2 = ps2.getGeneratedKeys();
            ids2.next();
            int id = ids2.getInt(1);

            Connection con3 = Connector.connection();
            String SQL3 = "insert into produkt_træ(id, produktId, træ_længde, træ_bredde, træ_dypde, meterpris) values(?,?,?,?,?,?)";
            PreparedStatement ps3 = con3.prepareStatement(SQL3, PreparedStatement.RETURN_GENERATED_KEYS);
            ps3.setInt(1, id);
            ps3.setInt(2, produktId);
            ps3.setDouble(3, længde);
            ps3.setDouble(4, bredde);
            ps3.setDouble(5, dybde);
            ps3.setDouble(6, pris);
            ps3.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

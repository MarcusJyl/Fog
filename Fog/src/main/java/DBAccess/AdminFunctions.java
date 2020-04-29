package DBAccess;
import java.sql.*;
public class AdminFunctions {

    public static int InsertHeight(int height) {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO height (height) VALUES(?)";
            PreparedStatement preparedStatement = con.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt (1, height);
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
            preparedStatement.setInt (1, height);
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
            preparedStatement.setInt (1, length);
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
            preparedStatement.setInt (1, length);
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
            preparedStatement.setInt (1, width);
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
            preparedStatement.setInt (1, width);
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
            preparedStatement.setInt (1, slope);
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
            preparedStatement.setInt (1, slope);
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
            preparedStatement.setInt (1, length);
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
            preparedStatement.setInt (1, width);
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
            preparedStatement.setInt (1, width);
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
            preparedStatement.setString (1, bekladning);
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
            preparedStatement.setString (1, bekladning);
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
            preparedStatement.setString (1, floor);
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
            preparedStatement.setString (1, floor);
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
            preparedStatement.setString (1, color);
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
            preparedStatement.setString (1, color);
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
            preparedStatement.setString (1, roof);
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
            preparedStatement.setString (1, roof);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


import java.sql.*;

public class DBAccess {


    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
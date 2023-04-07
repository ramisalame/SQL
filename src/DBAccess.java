import java.sql.*;

public class DBAccess {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres"; // Update with your actual database name
        String user = "postgres";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");


            String sql = "INSERT INTO test (column1, column2, column3) VALUES (?, ?, ?)"; // Update with your actual table name and columns


            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set values for the parameters in the SQL statement
            pstmt.setString(1, "yes"); // Update with the actual values to be inserted
            pstmt.setString(2, "sio");
            pstmt.setString(3, "valusse3");


            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data added to the database successfully.");
            } else {
                System.out.println("Failed to add data to the database.");
            }

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

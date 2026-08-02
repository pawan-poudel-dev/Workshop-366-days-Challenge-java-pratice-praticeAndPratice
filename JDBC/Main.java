import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        // Connection details
        String url = "jdbc:mysql://localhost:3306/backend_db";
        String user = "root";
        String password ="Sucessful@123#001"; // Put your actual MySQL password here

        // SQL code to insert a test user into the table we built
        String sql = "INSERT INTO users (username, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

            System.out.println("🚀 Successfully connected to the MySQL Database!");

            // Insert a test user into our new columns
            preparedStatement.setString(1, "first_user");
            preparedStatement.setString(2, "hello@world.com");

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("🎉 Celebration time! Your Java app just saved data to MySQL!");
            }

        } catch (Exception e) {
            System.out.println("❌ Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
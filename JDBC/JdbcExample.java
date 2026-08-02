import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) {
        // 1. Database details (Change YOUR_MYSQL_PASSWORD_HERE to your real password)
        String url = "jdbc:mysql://localhost:3306/backend_db";
        String user = "root";
        String password = "Sucessful@123#001";

        System.out.println("👋 Hello JDBC World! Let's read the database:\n");

        // 2. Connect and read the data
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users")) { // Assuming your table is named 'users'

            // 3. Loop through and print what we find
            while (rs.next()) {
                System.out.println("🆔 ID: " + rs.getInt(1));
                System.out.println("👤 User: " + rs.getString(2));
                System.out.println("✉️ Email: " + rs.getString(3));
                System.out.println("---------------------------");
            }

        } catch (Exception e) {
            System.out.println("❌ Error reading data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
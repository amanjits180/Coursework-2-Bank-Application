import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    // Returns a connection to the MS Access database
    public static Connection getConnection() {
        try {

            String url =
                "jdbc:ucanaccess://" +
    System.getProperty("user.dir") +
    java.io.File.separator +
    "Bank Application" +
    java.io.File.separator +
    "BankApplicationDB.accdb";

            return DriverManager.getConnection(url);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

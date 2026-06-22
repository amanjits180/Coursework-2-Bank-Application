import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    // Returns a connection to the MS Access database
    public static Connection getConnection() {
        try {

            String url =
                "jdbc:ucanaccess://C:/Users/USER/Desktop/Coursework 2 group work/Bank Application/BankApplicationDB.accdb";

            return DriverManager.getConnection(url);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
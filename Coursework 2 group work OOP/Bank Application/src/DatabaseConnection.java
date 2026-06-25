import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    // Returns a connection to the MS Access database
    public static Connection getConnection() {
        try {

      String url = "jdbc:ucanaccess://" +
          new java.io.File("Bank Application/BankApplicationDB.accdb").getAbsolutePath();

            return DriverManager.getConnection(url);

        } catch (Exception e) {
            e.printStackTrace();

       javax.swing.JOptionPane.showMessageDialog(
            null,
           "Database Connection Error: \n" + e.getMessage()
           
            return null;
        }
    }
}

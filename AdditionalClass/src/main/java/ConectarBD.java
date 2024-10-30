import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarBD {
    public static void main(String[] args) {
        String nameBD = "";
        String url =
                "jdbc:sqlserver://localhost:1433;databaseName=BD_TestBuyPoint;encrypt=true;trustServerCertificate=true";
        String usuario = "sa";
        String password = "12345689";

        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            System.out.println("¡Conexión exitosa a SQL Server!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/gestor_polizas";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // En XAMPP por defecto va vacía

    public static Connection getConexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a la base de datos gestor_polizas");
        } catch (SQLException e) {
            System.err.println("Error al conectar con MySQL: " + e.getMessage());
        }
        return con;
    }

    // Método main temporal solo para probar la conexión y sacar captura
    public static void main(String[] args) {
        getConexion();
    }
}

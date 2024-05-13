package Gimnasio;
import java.sql.*;

public class Conexion {
    private static final String database = "jdbc:mysql://92.222.10.128/AaronValea";
    private static final String usuario = "aaronvalea";
    private static final String password = "Clave123!";

    public Connection abrirConexion() {
        Connection link = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            link = DriverManager.getConnection(database, usuario, password);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
        return link;
    }

    public void insertarUsuario(String nombre, String usuario2, String contraseña, String correo, Date fecha) {
        Connection connection = abrirConexion();
        PreparedStatement stm = null;
        try {
            if (connection != null) {
                String sql = "INSERT INTO Usuario(Usuario,Nombre,password,Correo,fecha) VALUES (?,?,?,?,?)";
                stm = connection.prepareStatement(sql);
                stm.setString(1, usuario2);
                stm.setString(2, nombre);
                stm.setString(3, contraseña);
                stm.setString(4, correo);
                stm.setDate(5, fecha);
                stm.executeUpdate();
            } else {
                System.out.println("Conexión está nula.");
            }
        } catch (SQLException e) {
            System.out.println("Error sql: " + e.getMessage());
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error : " + ex.getMessage());
            }
        }
    }
}

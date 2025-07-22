package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            
            Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistema_reservas", 
                "root", 
                ""      
            );

            System.out.println("✅ Conexión a la base de datos exitosa.");

            

        } catch (ClassNotFoundException e) {
            System.out.println("❌ No se encontró el Driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con la base de datos.");
            e.printStackTrace();
        }
    }
}


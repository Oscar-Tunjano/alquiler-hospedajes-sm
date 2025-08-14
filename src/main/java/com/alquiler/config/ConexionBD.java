package com.alquiler.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConexionBD {
    private static Connection conexion = null;

    public static Connection getConnection() {
        if (conexion == null) {
            try {
                // Cargar archivo config.properties
                Properties props = new Properties();
                FileInputStream fis = new FileInputStream("config.properties");
                props.load(fis);

                String url = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String password = props.getProperty("db.password");

                // Cargar el driver JDBC
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establecer conexión
                conexion = DriverManager.getConnection(url, user, password);
                System.out.println("✅ Conexión a la base de datos exitosa");

            } catch (IOException e) {
                System.err.println("❌ Error al leer config.properties: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.err.println("❌ Driver JDBC no encontrado: " + e.getMessage());
            } catch (SQLException e) {
                System.err.println("❌ Error en la conexión: " + e.getMessage());
            }
        }
        return conexion;
    }
}

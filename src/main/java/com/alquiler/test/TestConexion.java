package com.alquiler.test;

import com.alquiler.config.ConexionBD;
import java.sql.Connection;

public class TestConexion {
    public static void main(String[] args) {
        Connection conn = ConexionBD.getConnection();
        
        if (conn != null) {
            System.out.println("✅ Conexión exitosa a la base de datos.");
        } else {
            System.out.println("❌ No se pudo establecer la conexión.");
        }
    }
}


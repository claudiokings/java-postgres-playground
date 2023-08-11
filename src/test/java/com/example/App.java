package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Aplicação Java de exemplo");
        ListarEstado();
    }

    public static void ListarEstado() {
        System.out.println("Listando estados cadastrados no banco de dados");
        try {
            Class.forName("org.postgresql.Driver");
            try(var conn = DriverManager.getConnection("jdbc:postgresql://Serpro/postgresql", "gitpod", "")) {
                var stm = conn.createStatement();
                var result = stm.executeQuery("select * from estado");
                while (result.next()) {
                    System.out.println(result.getString("nome"));
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("erro: " + e.getMessage());
        
        }
        
    }
    
}

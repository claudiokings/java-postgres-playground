package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBd {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca" + e.getMessage());
        }
        Statement statement = null;
        try (var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "")) {
            System.out.println("Conexão realizada com sucesso!");
        
            statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while(result.next()) {
                System.out.printf("id %d nome %s uf %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
            if (statement == null)
                System.err.println("não foi possível conectar ao banco" + e.getMessage());
            else System.out.println("não foi possível acessar o banco" + e.getMessage());
        }
    }
}

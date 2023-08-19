package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBd {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String URL = "jdbc:postgresql://localhost/postgres";
    private Connection conn;

    public static void main(String[] args) {
        new AppBd();
    }        
    
    public AppBd() {
        try (var conn = getConnection()) {
            listarEstados(conn);
            localizarEstados(conn, "SC");
        } catch (SQLException e) {
            System.err.println("não foi possível conectar ao banco" + e.getMessage());
        }
    }


    private void listarEstados(Connection conn) {

        try {     
            System.out.println("Conexão realizada com sucesso!");
            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while(result.next()) {
                System.out.printf("id %d nome %s uf %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
            System.err.println("não foi possível realizar a consulta ao banco" + e.getMessage());
        }
    }

    private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca" + e.getMessage());
        }
    }
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);

    }
    
    private void localizarEstados(Connection conn, String uf) {
        System.out.println();
        try {
            // var sql = "select * from estado where uf = '" + uf + "'";
            var sql = "select * from estado where uf = ?";
            var statement = conn.prepareCall(sql);
            System.out.println(sql);
            statement.setString(1, uf);
            var result = statement.executeQuery();
            if (result.next()) {
                System.out.printf("id %d nome %s uf %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível executar a consulta SQL" + e.getMessage());
        }
    }
}

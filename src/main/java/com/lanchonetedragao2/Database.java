package com.lanchonetedragao2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Connection conectar(){
        String url = "jdbc:sqlite:lanchonete.db";
        Connection conn = null;
        try{
            conn=DriverManager.getConnection(url);
            System.out.println("Conexão com SQLite estabelecida.");
        } catch (SQLException e) {
            System.out.println("Falha na conexão com o SQLite: "+ e.getMessage());
        }
        return conn;
    }
}
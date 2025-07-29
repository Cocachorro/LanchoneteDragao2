package com.lanchonetedragao2;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Connection conectar(){
        Connection conn = null;
        try{
            URL local=Database.class.getResource("/lanchonete.db");
            if (local==null)throw new SQLException("Arquivo do DB não encontrado: lanchonete.db.");
            String url = "jdbc:sqlite:"+local.toExternalForm().substring(6);
            conn=DriverManager.getConnection(url);
            System.out.println("Conexão com SQLite estabelecida.");
        } catch (SQLException e) {
            System.out.println("Falha na conexão com o SQLite: "+ e.getMessage());
        }
        return conn;
    }
}
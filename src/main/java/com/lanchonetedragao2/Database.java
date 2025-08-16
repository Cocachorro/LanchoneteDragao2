package com.lanchonetedragao2;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String DB_NAME = "lanchonete.db";

    public static Connection conectar() {
        Connection conn = null;
        try {
            Path dbPath = new File(System.getProperty("java.io.tmpdir"), DB_NAME).toPath();
            if (!Files.exists(dbPath)) {
                try (InputStream in = Database.class.getResourceAsStream("/" + DB_NAME)) {
                    if (in == null) {
                        throw new SQLException("Arquivo do DB não encontrado no JAR: " + DB_NAME);
                    }
                    Files.copy(in, dbPath, StandardCopyOption.REPLACE_EXISTING);
                }
            }
            String url = "jdbc:sqlite:" + dbPath.toAbsolutePath().toString();
            conn = DriverManager.getConnection(url);
            System.out.println("Conexão com SQLite estabelecida com sucesso.");

        } catch (Exception e) {
            System.err.println("Falha na conexão com o SQLite: " + e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }
}
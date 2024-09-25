package com.example.core.DB.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.core.DB.Database;

public class DatabaseImpl {
    public void testConnection() {
        try (Connection connection = Database.getConnection()) {
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

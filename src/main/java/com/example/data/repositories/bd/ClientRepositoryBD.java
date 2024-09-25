package com.example.data.repositories.bd;

import com.example.data.entites.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientRepositoryBD {

    private Connection connection;

    public ClientRepositoryBD(Connection connection) {
        this.connection = connection;
    }

    // Méthode pour sauvegarder un client dans la base de données
    public void save(Client client) {
        String query = "INSERT INTO clients (surname, phone, address) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, client.getSurname());
            stmt.setString(2, client.getTelephone());
            stmt.setString(3, client.getAddress());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour trouver un client par ID
    public Client findById(int id) {
        String query = "SELECT * FROM clients WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Client(
                    rs.getInt("id"),
                    rs.getString("surname"),
                    rs.getString("phone"),
                    rs.getString("address")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}


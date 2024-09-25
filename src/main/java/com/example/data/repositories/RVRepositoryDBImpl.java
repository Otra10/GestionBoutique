package com.example.data.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.core.DB.Database;
import com.example.data.entites.Medecin;
import com.example.data.entites.Rv;
import com.example.data.repositories.bd.RVRepository;

public class RVRepositoryDBImpl implements RVRepository {

    @Override
    public void save(Rv rv) {
        String sql = "INSERT INTO rv (id, date, medecin_id) VALUES (?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, rv.getId());
            stmt.setTimestamp(2, Timestamp.valueOf(rv.getDate()));
            stmt.setInt(3, rv.getMedecin().getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Rv> findAll() {
        String sql = "SELECT * FROM rv JOIN medecins ON rv.medecin_id = medecins.id";
        List<Rv> rvList = new ArrayList<>();
        try (Connection conn = Database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Medecin medecin = new Medecin(
                        rs.getInt("medecin_id"),
                        rs.getString("nom"),
                        rs.getString("prenom")
                );
                Rv rv = new Rv(
                        rs.getInt("id"),
                        rs.getTimestamp("date").toLocalDateTime(),
                        medecin
                );
                rvList.add(rv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rvList;
    }

    @Override
    public List<Rv> findByDate(LocalDateTime date) {
        String sql = "SELECT * FROM rv WHERE date::date = ?";
        List<Rv> rvList = new ArrayList<>();
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, java.sql.Date.valueOf(date.toLocalDate()));
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Medecin medecin = new Medecin(
                        rs.getInt("medecin_id"),
                        rs.getString("nom"),
                        rs.getString("prenom")
                );
                Rv rv = new Rv(
                        rs.getInt("id"),
                        rs.getTimestamp("date").toLocalDateTime(),
                        medecin
                );
                rvList.add(rv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rvList;
    }
}

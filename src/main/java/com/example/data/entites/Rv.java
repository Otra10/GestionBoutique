package com.example.data.entites;

import java.time.LocalDateTime;

public class Rv {
    private int id;
    private LocalDateTime date;
    private Medecin medecin;

    public Rv(int id, LocalDateTime date, Medecin medecin) {
        this.id = id;
        this.date = date;
        this.medecin = medecin;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    public Medecin getMedecin() { return medecin; }
    public void setMedecin(Medecin medecin) { this.medecin = medecin; }
}

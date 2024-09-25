package com.example.data.repositories.bd;

import com.example.data.entites.Medecin;
import java.util.ArrayList;
import java.util.List;

public class MedecinRepository {
    private List<Medecin> medecins = new ArrayList<>();

    public void save(Medecin medecin) {
        medecins.add(medecin);
    }

    public List<Medecin> findAll() {
        return medecins;
    }
}

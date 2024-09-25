package com.example.services;

import java.util.List;

import com.example.data.entites.Medecin;
import com.example.data.repositories.bd.MedecinRepository;

public class MedecinService {
    private final MedecinRepository medecinRepository;

    public MedecinService(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    public void createMedecin( String nom, String prenom) {
        Medecin medecin = new Medecin(nom, prenom);
        medecinRepository.save(medecin);
    }

    public List<Medecin> listMedecins() {
        return medecinRepository.findAll();
    }
}

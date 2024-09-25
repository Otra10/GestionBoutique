package com.example.services.interfaces;

import com.example.data.entites.Medecin;
import java.util.List;

public interface IMedecinService {
    void createMedecin(int id, String nom, String prenom);
    List<Medecin> listMedecins();
}

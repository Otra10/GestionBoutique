package com.example.core.Factory;

import com.example.data.entites.Medecin;

public class MedecinFactory {
    public static Medecin createMedecin(int id, String nom, String prenom) {
        return new Medecin(id, nom, prenom);
    }
}

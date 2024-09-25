package com.example.views;

import com.example.services.MedecinService;
import com.example.services.RVService;
import com.example.data.entites.Medecin;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class MenuView {
    private final MedecinService medecinService;
    private final RVService rvService;
    private final Scanner scanner;

    public MenuView(MedecinService medecinService, RVService rvService) {
        this.medecinService = medecinService;
        this.rvService = rvService;
        this.scanner = new Scanner(System.in);
    }

    public void afficherMenu() {
        int choix = -1;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enregistrer un médecin");
            System.out.println("2. Lister les médecins");
            System.out.println("3. Enregistrer un rendez-vous");
            System.out.println("4. Lister les rendez-vous");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    enregistrerMedecin();
                    break;
                case 2:
                    listerMedecins();
                    break;
                case 3:
                    enregistrerRV();
                    break;
                case 4:
                    listerRV();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        } while (choix != 0);
    }

    private void enregistrerMedecin() {
        System.out.print("Entrez le nom du médecin : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom du médecin : ");
        String prenom = scanner.nextLine();

        medecinService.createMedecin(nom, prenom);
        System.out.println("Médecin enregistré avec succès !");
    }

    private void listerMedecins() {
        List<Medecin> medecins = medecinService.listMedecins();
        if (medecins.isEmpty()) {
            System.out.println("Aucun médecin enregistré.");
        } else {
            System.out.println("\n--- Liste des Médecins ---");
            for (Medecin medecin : medecins) {
                System.out.println(medecin.getNom() + " " + medecin.getPrenom());
            }
        }
    }

    private void enregistrerRV() {
        List<Medecin> medecins = medecinService.listMedecins();
        if (medecins.isEmpty()) {
            System.out.println("Aucun médecin disponible pour un rendez-vous.");
            return;
        }

        System.out.println("\n--- Médecins Disponibles ---");
        for (int i = 0; i < medecins.size(); i++) {
            Medecin medecin = medecins.get(i);
            System.out.println((i + 1) + ": " + medecin.getNom() + " " + medecin.getPrenom());
        }

        System.out.print("Sélectionnez le numéro du médecin : ");
        int medecinIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Pour consommer la nouvelle ligne

        if (medecinIndex < 0 || medecinIndex >= medecins.size()) {
            System.out.println("Numéro de médecin invalide.");
            return;
        }

        Medecin medecin = medecins.get(medecinIndex);

        System.out.print("Entrez la date du rendez-vous (AAAA-MM-JJ HH:MM) : ");
        String dateInput = scanner.nextLine();
        LocalDateTime dateRV = LocalDateTime.parse(dateInput.replace(" ", "T"));

        rvService.createRV(dateRV, medecin);
        System.out.println("Rendez-vous enregistré avec succès !");
    }

    private void listerRV() {
        List<RV> rvList = rvService.listRV();
        if (rvList.isEmpty()) {
            System.out.println("Aucun rendez-vous enregistré.");
        } else {
            System.out.println("\n--- Liste des Rendez-vous ---");
            for (RV rv : rvList) {
                System.out.println("Rendez-vous le " + rv.getDate() + " avec " + rv.getMedecin().getNom() + " " + rv.getMedecin().getPrenom());
            }
        }
    }
}

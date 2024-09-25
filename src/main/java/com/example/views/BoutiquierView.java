package com.example.views;

import java.util.Scanner;

import com.example.services.interfaces.IClientService;
import com.example.services.interfaces.IDebtService;

public class BoutiquierView {
    private final IClientService clientService;
    private final IDebtService debtService;
    private final Scanner scanner = new Scanner(System.in);

    public BoutiquierView(IClientService clientService, IDebtService debtService) {
        this.clientService = clientService;
        this.debtService = debtService;
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("1. Créer un client");
            System.out.println("2. Lister les clients");
            System.out.println("3. Créer une dette");
            System.out.println("4. Lister les dettes non soldées");
            System.out.println("0. Quitter");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choice) {
                case 1:
                    createClient();
                    break;
                case 2:
                    listClients();
                    break;
                case 3:
                    createDebt();
                    break;
                case 4:
                    listUnpaidDebts();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choice != 0);
    }

    private void createClient() {
        System.out.print("Nom du client : ");
        String surname = scanner.nextLine();
        System.out.print("Téléphone : ");
        String telephone = scanner.nextLine();
        System.out.print("Adresse : ");
        String address = scanner.nextLine();
        clientService.createClient(surname, telephone, address, false);
        System.out.println("Client créé avec succès.");
    }

    private void listClients() {
        clientService.listClients().forEach(client ->
                System.out.println(client.getSurname() + " - " + client.getTelephone())
        );
    }

    private void createDebt() {
        // Implementation for creating debt
    }

    private void listUnpaidDebts() {
        debtService.listUnpaidDebts().forEach(debt ->
                System.out.println("Montant restant : " + debt.getRemainingAmount())
        );
    }
}

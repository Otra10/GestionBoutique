package com.example.data.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.data.entites.Client;

public class ClientRepository {
    private final List<Client> clients = new ArrayList<>();

    public void createClient(Client client) {
        clients.add(client);
    }

    public List<Client> listClients() {
        return clients;
    }

    public Client findClientByPhone(String telephone) {
        return clients.stream().filter(client -> client.getTelephone().equals(telephone)).findFirst().orElse(null);
    }
}

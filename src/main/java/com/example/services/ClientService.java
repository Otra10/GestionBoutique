package com.example.services;

import java.util.List;

import com.example.data.entites.Client;
import com.example.data.repositories.ClientRepository;
import com.example.services.interfaces.IClientService;

public class ClientService implements IClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void createClient(String surname, String telephone, String address, boolean hasAccount) {
        Client client = new Client(surname, telephone, address, hasAccount, 0.0);
        clientRepository.createClient(client);
    }

    @Override
    public List<Client> listClients() {
        return clientRepository.listClients();
    }

    @Override
    public Client findClientByPhone(String telephone) {
        return clientRepository.findClientByPhone(telephone);
    }
}

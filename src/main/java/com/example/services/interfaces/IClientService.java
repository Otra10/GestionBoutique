package com.example.services.interfaces;

import java.util.List;

import com.example.entites.Client;

public interface IClientService {
    void createClient(String surname, String telephone, String address, boolean hasAccount);
    List<Client> listClients();
    Client findClientByPhone(String telephone);
}

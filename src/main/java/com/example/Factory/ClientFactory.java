package com.example.Factory;


import com.example.entites.Client;

public class ClientFactory implements Factory<Client> {
    @Override
    public Client create() {
        return new Client(null, null, null, false, 0); // Logique complexe de création
    }
}

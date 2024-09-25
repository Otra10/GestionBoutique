package com.example.core.Factory;


import com.example.data.entites.Client;

public class ClientFactory implements Factory<Client> {
    @Override
    public Client create() {
        return new Client(0, null, null, null); // Logique complexe de création
    }
}

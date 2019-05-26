package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.Client;

public interface ClientDao {
    Iterable<Client> listClient();

    void deleteClient(Integer clientId);

    Client getClientById(Integer clientId);

    Client save(Client client);

}

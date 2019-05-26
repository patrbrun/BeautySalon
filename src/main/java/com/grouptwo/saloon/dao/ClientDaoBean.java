package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.Client;
import com.grouptwo.saloon.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDaoBean implements ClientDao {
    private ClientRepository clientRepository;

    @Autowired
    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Iterable<Client> listClient() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClient(Integer clientId) {
        clientRepository.deleteById(clientId);
    }

    @Override
    public Client getClientById(Integer clientId) {
        return clientRepository.findById(clientId).orElse(null);
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }
}

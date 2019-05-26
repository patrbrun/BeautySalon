package com.grouptwo.saloon.repository;

import com.grouptwo.saloon.model.Client;

import java.util.List;

public class ClientCustomRepository {
    List<Client> findClientByParams(Integer ID, String name, String email, Integer phone_number);
}

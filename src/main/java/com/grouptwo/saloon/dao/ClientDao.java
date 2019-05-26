package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.Client;

<<<<<<< HEAD
public interface AppointmentDao {
    Iterable<Appointment> listAppointments();

    void deleteAppointment(Integer appointmentId);

    Appointment getAppointmentById(Integer appointmentId);

    Appointment save(Appointment appointment);

}
=======
public interface ClientDao {
    Iterable<Client> listClient();

    void deleteClient(Integer clientId);

    Client getClientById(Integer clientId);

    Client save(Client client);

}
>>>>>>> remotes/origin/master

package com.grouptwo.saloon.dao;

import com.grouptwo.saloon.model.Appointment;

public interface AppointmentDao {
    Iterable<Appointment> listAppointments();

    void deleteAppointment(Integer appointmentId);

    Appointment getAppointmentById(Integer appointmentId);

    Appointment save(Appointment appointment);

}

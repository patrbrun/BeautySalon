package com.grouptwo.saloon.repository;

import com.grouptwo.saloon.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository <Appointment, Long>{
    List <Appointment> findAppointmentByAppointmentID (int appointmentID);
}

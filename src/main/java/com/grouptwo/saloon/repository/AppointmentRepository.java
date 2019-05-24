package com.grouptwo.saloon.repository;

import com.grouptwo.saloon.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}

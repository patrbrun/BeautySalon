package com.grouptwo.saloon.repository;

import com.grouptwo.saloon.model.Employee;
import ee.itcollage.garageapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);
}

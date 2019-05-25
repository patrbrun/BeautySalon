package com.grouptwo.saloon.repository;
import com.grouptwo.saloon.model.Employee;

import com.grouptwo.saloon.repository.custom.EmployeeCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, EmployeeCustomRepository {

    List<Employee> findByName(String name);
}
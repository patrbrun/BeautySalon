package com.grouptwo.saloon.repository.custom;

import com.grouptwo.saloon.model.Employee;

import java.util.List;

public interface EmployeeCustomRepository {

    List<Employee> findEmployeeByParams(String name, String job_title, String phone_num);
}

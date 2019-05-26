package com.grouptwo.saloon.service;

import com.grouptwo.saloon.model.Employee;
import com.grouptwo.saloon.repository.EmployeeRepository;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import static org.springframework.http.HttpStatus.BAD_REQUEST;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll(String name, String job_title, String phone_num) {
        if (StringUtils.isNotBlank(name) || StringUtils.isNotBlank(phone_num) || StringUtils.isNotBlank(job_title)) {
            return employeeRepository.findEmployeeByParams(name, job_title, phone_num);
        }
        return employeeRepository.findAll();
    }

}
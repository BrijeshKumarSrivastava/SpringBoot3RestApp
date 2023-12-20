package com.accenture.employeeservice.service;

import com.accenture.employeeservice.entity.Employee;
import com.accenture.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(EmployeeService.class);
    private final List<Employee> employees
            = new ArrayList<>();
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        LOGGER.info("Employee added with: id={}", employee.getId());

        return employeeRepository.addEmployee(employee);
    }

     public List<Employee> findAll() {
        LOGGER.info("Employee listed..");

        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        LOGGER.info("Employee found with : id={}", id);
        return employeeRepository.findById(id);
    }
}

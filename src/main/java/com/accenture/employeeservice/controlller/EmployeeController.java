package com.accenture.employeeservice.controlller;

import com.accenture.employeeservice.entity.Employee;
import com.accenture.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //Build REST API to register an employee
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);
    }

    //Build REST API to find an employee by id
    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id) {

        return employeeService.findById(id);
    }

    //Build REST API to list all registered employees
    @GetMapping("/getAll")
    public List<Employee> findAll() {

        return employeeService.findAll();
    }

}

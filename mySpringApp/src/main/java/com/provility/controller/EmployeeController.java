package com.provility.controller;

import com.provility.Service.EmployeeService;
import com.provility.entity.Employee;
import com.provility.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    @Autowired
    public EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService employeeService;


    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(path = "/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployeeList(employee);
    }

    @GetMapping(path = "/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }
    @PutMapping(path = "/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.update(employee);
    }
}
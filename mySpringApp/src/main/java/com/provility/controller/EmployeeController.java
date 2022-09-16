package com.provility.controller;

import com.provility.Service.EmployeeService;
import com.provility.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {


    final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping(path = "/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployeeList(employee);
    }

    @GetMapping(path = "/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @PutMapping(path = "/edit")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)

    public void deleteEmployee(@PathVariable int id) {

        employeeService.deleteEmployeeObjById(id);
    }
}
package com.provility.Service;

import com.provility.entity.Employee;
import com.provility.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployeeList(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    public Employee update(Employee employee) {
        Employee emp = employeeRepository.findById(employee.id).get();
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        return employeeRepository.save(emp);
    }

    public List<Employee> findAllEmployees() {

        return employeeRepository.findAll();
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}

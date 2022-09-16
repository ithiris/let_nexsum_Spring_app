package com.provility.Service;

import com.provility.entity.Employee;
import com.provility.repository.EmpAddressRepository;
import com.provility.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmpAddressRepository empAddressRepository;

    public Employee saveEmployeeList(Employee emp) {
        Employee employee = employeeRepository.save(emp);
        employee.employeeAddresses.forEach((empAdd -> {
            empAdd.empId = emp.id;
            empAddressRepository.save(empAdd);
        }));
        return employee;
    }

    public Employee getEmployeeById(int id) {
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

    public void deleteEmployeeObjById(int id) {
        employeeRepository.deleteById(id);
    }
}

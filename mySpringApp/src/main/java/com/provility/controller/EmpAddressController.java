package com.provility.controller;


import com.provility.Service.EmpAddressService;
import com.provility.entity.Employee;
import com.provility.entity.EmployeeAddress;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/address")
public class EmpAddressController {

    final EmpAddressService empAddressService;

    public EmpAddressController(EmpAddressService empAddressService) {
        this.empAddressService = empAddressService;
    }


    @GetMapping("/all")
    public List<EmployeeAddress> getAllEmployeeAddress() {
        return empAddressService.getAllEmployeesAddress();
    }

    @GetMapping(path = "/{id}")
    public EmployeeAddress getEmployeeAddressById(@PathVariable int id) {
        return empAddressService.getEmployeeAddressById(id);
    }

}

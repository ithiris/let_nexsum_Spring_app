package com.provility.Service;

import com.provility.entity.EmployeeAddress;
import com.provility.repository.EmpAddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpAddressService {

    final EmpAddressRepository empAddressRepository;

    public EmpAddressService(EmpAddressRepository empAddressRepository) {
        this.empAddressRepository = empAddressRepository;
    }

    public List<EmployeeAddress> getAllEmployeesAddress() {

        return empAddressRepository.findAll();
    }


    public EmployeeAddress getEmployeeAddressById(int id) {
        return empAddressRepository.findById(id).get();
    }
}

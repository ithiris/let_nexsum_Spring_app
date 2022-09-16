package com.provility.repository;

import com.provility.entity.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpAddressRepository extends JpaRepository<EmployeeAddress,Integer> {
}

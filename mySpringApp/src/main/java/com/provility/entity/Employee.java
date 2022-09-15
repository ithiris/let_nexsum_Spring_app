package com.provility.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(length = 45, nullable = false, name = "first_name")
    public String firstName;
    @Column(length = 45, nullable = false, name = "last_name")
    public String lastName;

    @OneToMany(mappedBy = "id")
    public List<EmpLoyeeAddress> empLoyeeAddresses;

    public Employee(String firstName, String lastName, List<EmpLoyeeAddress> empLoyeeAddresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empLoyeeAddresses =empLoyeeAddresses;
    }

    public Employee() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<EmpLoyeeAddress> getEmpLoyeeAddresses() {
        return empLoyeeAddresses;
    }

    public void setEmpLoyeeAddresses(List<EmpLoyeeAddress> empLoyeeAddresses) {
        this.empLoyeeAddresses = empLoyeeAddresses;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id='" + id + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

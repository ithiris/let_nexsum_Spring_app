package com.provility.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(length = 45, nullable = false, name = "first_name")
    public String firstName;
    @Column(length = 45, nullable = false, name = "last_name")
    public String lastName;

    @OneToMany(mappedBy = "id")
    public List<EmployeeAddress> employeeAddresses;

    public Employee() {

    }

    public Employee(String firstName, String lastName, List<EmployeeAddress> employeeAddresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeAddresses = employeeAddresses;
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


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empLoyeeAddresses=" + employeeAddresses +
                '}';
    }
}

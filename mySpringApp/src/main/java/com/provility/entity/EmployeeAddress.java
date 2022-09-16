package com.provility.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class EmployeeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Integer id;


    @Column(name = "city")
    public String city;
    @Column(name = "country")
    public String country;

    @Column(name = "emp_id")
    public Integer empId;


    public EmployeeAddress() {

    }

    public EmployeeAddress(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "EmpLoyeeAddress{" +
                "id=" + empId +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

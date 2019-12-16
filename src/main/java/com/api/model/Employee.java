package com.api.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameEmployee;
    private String lastNameEmployee;
    private String chargeEmployee;
    private String directionEmployee;
    private String telephoneEmployee;
    private Date dateOfBirth;
    private Date hiringDate;

    public Employee() {
    }

    public Employee(String nameEmployee, String lastNameEmployee, String chargeEmployee, String directionEmployee, String telephoneEmployee, Date dateOfBirth, Date hiringDate) {
        this.nameEmployee = nameEmployee;
        this.lastNameEmployee = lastNameEmployee;
        this.chargeEmployee = chargeEmployee;
        this.directionEmployee = directionEmployee;
        this.telephoneEmployee = telephoneEmployee;
        this.dateOfBirth = dateOfBirth;
        this.hiringDate = hiringDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getLastNameEmployee() {
        return lastNameEmployee;
    }

    public void setLastNameEmployee(String lastNameEmployee) {
        this.lastNameEmployee = lastNameEmployee;
    }

    public String getChargeEmployee() {
        return chargeEmployee;
    }

    public void setChargeEmployee(String chargeEmployee) {
        this.chargeEmployee = chargeEmployee;
    }

    public String getDirectionEmployee() {
        return directionEmployee;
    }

    public void setDirectionEmployee(String directionEmployee) {
        this.directionEmployee = directionEmployee;
    }

    public String getTelephoneEmployee() {
        return telephoneEmployee;
    }

    public void setTelephoneEmployee(String telephoneEmployee) {
        this.telephoneEmployee = telephoneEmployee;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }
}

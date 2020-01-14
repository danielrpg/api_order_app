package com.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee extends AuditModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;

    @NotNull
    @Size(max = 200)
    private String nameEmployee;

    @NotNull
    @Size(max = 200)
    private String lastNameEmployee;

    @Size(max = 200)
    private String chargeEmployee;

    @Size(max = 200)
    private String directionEmployee;

    @Size(max = 200)
    private String telephoneEmployee;

    private Date dateOfBirth;

    @NotNull
    @Size(max = 200)
    private Date hiringDate;

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

package com.api.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "carriers")
public class Carrier extends AuditModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrier_id")
    private Long id;

    @Size(max = 250)
    @Column()
    private String companyName;

    @OneToMany(
            mappedBy = "carrier",
            cascade = CascadeType.ALL
    )
    private Set<CarrierZipCode> carrierZipCodes = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<CarrierZipCode> getCarrierZipCodes() {
        return carrierZipCodes;
    }

    public void setCarrierZipCodes(Set<CarrierZipCode> carrierZipCodes) {
        this.carrierZipCodes = carrierZipCodes;
    }
}

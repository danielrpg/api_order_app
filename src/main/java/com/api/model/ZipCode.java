package com.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "zip_codes")
public class ZipCode extends AuditModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zipcode_id")
    private Long id;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String zipCodeName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "location_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Location location;

    @OneToMany(
            mappedBy = "supplier",
            cascade = CascadeType.ALL
    )
    private Set<SupplierZipCode> supplierZipCodes = new HashSet<>();

    @OneToMany(
            mappedBy = "client",
            cascade = CascadeType.ALL
    )
    private Set<ClientZipCode> clientZipCodes = new HashSet<>();

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

    public String getZipCodeName() {
        return zipCodeName;
    }

    public void setZipCodeName(String zipCodeName) {
        this.zipCodeName = zipCodeName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<SupplierZipCode> getSupplierZipCodes() {
        return supplierZipCodes;
    }

    public void setSupplierZipCodes(Set<SupplierZipCode> supplierZipCodes) {
        this.supplierZipCodes = supplierZipCodes;
    }

    public Set<ClientZipCode> getClientZipCodes() {
        return clientZipCodes;
    }

    public void setClientZipCodes(Set<ClientZipCode> clientZipCodes) {
        this.clientZipCodes = clientZipCodes;
    }

    public Set<CarrierZipCode> getCarrierZipCodes() {
        return carrierZipCodes;
    }

    public void setCarrierZipCodes(Set<CarrierZipCode> carrierZipCodes) {
        this.carrierZipCodes = carrierZipCodes;
    }
}

package com.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "supplier_zip_codes")
public class SupplierZipCode extends AuditModel {

    @EmbeddedId
    private SupplierZipCodeId primaryKey = new SupplierZipCodeId();

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String contactName;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String direction;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String telephoneSupplier;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String emailSupplier;

    @ManyToOne
    @MapsId("supplierId")
    private Supplier supplier;

    @ManyToOne
    @MapsId("zipcodeId")
    private ZipCode zipCode;

    public SupplierZipCode() {
    }

    public SupplierZipCode(@NotNull @Size(max = 200) String contactName, @NotNull @Size(max = 200) String direction, @NotNull @Size(max = 200) String telephoneSupplier, @NotNull @Size(max = 200) String emailSupplier, Supplier supplier, ZipCode zipCode) {
        this.contactName = contactName;
        this.direction = direction;
        this.telephoneSupplier = telephoneSupplier;
        this.emailSupplier = emailSupplier;
        this.supplier = supplier;
        this.zipCode = zipCode;
    }

    public SupplierZipCodeId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(SupplierZipCodeId primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTelephoneSupplier() {
        return telephoneSupplier;
    }

    public void setTelephoneSupplier(String telephoneSupplier) {
        this.telephoneSupplier = telephoneSupplier;
    }

    public String getEmailSupplier() {
        return emailSupplier;
    }

    public void setEmailSupplier(String emailSupplier) {
        this.emailSupplier = emailSupplier;
    }

    @Transient
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Transient
    public ZipCode getZipCode() {
        return zipCode;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }
}

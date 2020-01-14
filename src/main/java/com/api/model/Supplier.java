package com.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "suppliers")
public class Supplier extends AuditModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private int id;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String supplierName;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String direction;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String telephone;

    @OneToMany(
            mappedBy = "supplier",
            cascade = CascadeType.ALL
    )
    private Set<SupplierZipCode> supplierZipCodes = new HashSet<>();

    @ManyToMany(cascade = {
            CascadeType.ALL
    })
    @JoinTable(
            name = "supplier_product",
            joinColumns = @JoinColumn(name = "supplier_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id") )
    private Set<Product> products = new HashSet<>();

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<SupplierZipCode> getSupplierZipCodes() {
        return supplierZipCodes;
    }

    public void setSupplierZipCodes(Set<SupplierZipCode> supplierZipCodes) {
        this.supplierZipCodes = supplierZipCodes;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}

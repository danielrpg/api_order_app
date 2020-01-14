package com.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Product")
@Table(name = "products")
public class Product extends AuditModel{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String productName;

    @NotNull
    private float productPurchasePrice;

    @NotNull
    private float productSalePrice;

    @NotNull
    private Integer unitsStock;

    @NotNull
    private Integer minStock;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String productDescription;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "category_product",
            joinColumns = @JoinColumn(name = "product_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "category_id", nullable = false) )
    private Set<Category> categories = new HashSet<>();

    @OneToMany(
            mappedBy = "order",
            cascade = CascadeType.ALL
    )
    private Set<OrderProduct> orderProducts = new HashSet<>();

    @ManyToMany(mappedBy = "products", cascade = { CascadeType.ALL })
    private Set<Supplier> suppliers = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPurchasePrice() {
        return productPurchasePrice;
    }

    public void setProductPurchasePrice(float productPurchasePrice) {
        this.productPurchasePrice = productPurchasePrice;
    }

    public float getProductSalePrice() {
        return productSalePrice;
    }

    public void setProductSalePrice(float productSalePrice) {
        this.productSalePrice = productSalePrice;
    }

    public Integer getUnitsStock() {
        return unitsStock;
    }

    public void setUnitsStock(Integer unitsStock) {
        this.unitsStock = unitsStock;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Set<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}

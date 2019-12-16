package com.api.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private float productPurchasePrice;
    private float productSalePrice;
    private Integer unitsStock;
    private Integer minStock;
    private String productDescription;

    public Product() {
    }

    public Product(String productName, float productPurchasePrice, float productSalePrice, Integer unitsStock, Integer minStock, String productDescription) {
        this.productName = productName;
        this.productPurchasePrice = productPurchasePrice;
        this.productSalePrice = productSalePrice;
        this.unitsStock = unitsStock;
        this.minStock = minStock;
        this.productDescription = productDescription;
    }

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
}

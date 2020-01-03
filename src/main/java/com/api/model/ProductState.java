package com.api.model;

import javax.persistence.*;

@Entity
@Table(name = "productstates")
public class ProductState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productStateName;
    private String productStateDescription;

    public ProductState(Long id, String productStateName, String productStateDescription) {
        this.id = id;
        this.productStateName = productStateName;
        this.productStateDescription = productStateDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductStateName() {
        return productStateName;
    }

    public void setProductStateName(String productStateName) {
        this.productStateName = productStateName;
    }

    public String getProductStateDescription() {
        return productStateDescription;
    }

    public void setProductStateDescription(String productStateDescription) {
        this.productStateDescription = productStateDescription;
    }
}

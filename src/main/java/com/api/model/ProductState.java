package com.api.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product_states")
public class ProductState extends AuditModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_state_id")
    private Long id;

    @Size(max = 200)
    private String productStateName;

    @Size(max = 500)
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

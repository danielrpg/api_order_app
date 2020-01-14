package com.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order extends AuditModel {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @Column(name = "order_date")
    @JsonFormat(pattern="MM/dd/YYYY")
    private Date orderDate;

    @Column(name = "shipping_date")
    @JsonFormat(pattern="MM/dd/YYYY")
    private Date shippingDate;

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String shippingPath;

    @Column(name = "goal_date")
    @JsonFormat(pattern="MM/dd/YYYY")
    private Date goalDate;

    @Column(name = "delivery_date")
    @JsonFormat(pattern="MM/dd/YYYY")
    private Date deliveryDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Client client;

    @OneToMany(
            mappedBy = "order",
            cascade = CascadeType.ALL
    )
    private Set<OrderProduct> orderProducts = new HashSet<>();

    public Order() {
    }

    public Order(Date orderDate, Date shippingDate, @NotNull @Size(max = 200) String shippingPath, Date goalDate, Date deliveryDate, Client client, Set<OrderProduct> orderProducts) {
        this.orderDate = orderDate;
        this.shippingDate = shippingDate;
        this.shippingPath = shippingPath;
        this.goalDate = goalDate;
        this.deliveryDate = deliveryDate;
        this.client = client;
        this.orderProducts = orderProducts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getShippingPath() {
        return shippingPath;
    }

    public void setShippingPath(String shippingPath) {
        this.shippingPath = shippingPath;
    }

    public Date getGoalDate() {
        return goalDate;
    }

    public void setGoalDate(Date goalDate) {
        this.goalDate = goalDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(Set<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }
}

package com.api.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date orderDate;
    private Date shippingDate;
    private String shippingPath;
    private Date goalDate;
    private Date deliveryDate;

    public Order() {
    }

    public Order(Date orderDate, Date shippingDate, String shippingPath, Date goalDate, Date deliveryDate) {
        this.orderDate = orderDate;
        this.shippingDate = shippingDate;
        this.shippingPath = shippingPath;
        this.goalDate = goalDate;
        this.deliveryDate = deliveryDate;
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
}

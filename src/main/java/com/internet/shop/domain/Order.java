package com.internet.shop.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by MyUser on 05.10.2015.
 */
@Entity
public class Order {
    @Id
    @GeneratedValue
    private long id;
    private String email;
    private OrderStatusEnum orderStatus = OrderStatusEnum.NEW;
    private List<OrderLine> orderLines = new LinkedList<>();

    public Order() {
    }

    public Order(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setGood (OrderLine orderLine){}

    public void setGoods (List<OrderLine> orderLines){}






}

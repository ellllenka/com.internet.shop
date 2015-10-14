package com.internet.shop.service;

import com.internet.shop.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MyUser on 06.10.2015.
 */
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public long addOrder(String email, List<OrderLine> orderLines){
        Order order = new Order(email);
        order.setGoods(orderLines);
        order = orderRepository.save(order);
        return order.getId();
    }

    public Page<Order> getOrders(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }

    public Order getOrder(long id){
        return orderRepository.findOne(id);
    }

    public void updateStatus(long id, OrderStatusEnum orderStatus){
        // TODO implements it;
    }



}

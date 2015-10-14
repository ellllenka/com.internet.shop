package com.internet.shop.controller;

import com.internet.shop.domain.Order;
import com.internet.shop.domain.OrderLine;
import com.internet.shop.domain.OrderStatusEnum;
import com.internet.shop.service.GoodService;
import com.internet.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by MyUser on 07.10.2015.
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    @ResponseBody
    public long addOrder(String email, LinkedList<OrderLine> orderLines) {
        return orderService.addOrder(email, orderLines);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    @ResponseBody
    public Page<Order> getOrder (Pageable pageable){
        return orderService.getOrders(pageable);
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    @ResponseBody
    public Order getOrder (long id){
        return orderService.getOrder(id);
    }

    @RequestMapping(value = "/order/status", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void updateOrder(long id, OrderStatusEnum orderStatus) {
        orderService.updateStatus(id, orderStatus);
    }

}

package com.eventdriven.orders.service;

import com.eventdriven.orders.model.Order;
import com.eventdriven.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order createOrder(Order order) {
        order.setOrderDate(new Date());
        return repository.save(order);
    }

}

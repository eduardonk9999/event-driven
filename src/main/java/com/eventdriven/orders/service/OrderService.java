package com.eventdriven.orders.service;

import com.eventdriven.orders.model.CustomerOrdeer;
import com.eventdriven.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public CustomerOrdeer createOrder(CustomerOrdeer order) {
        order.setOrderDate(new Date());
        return repository.save(order);  // Persistir o pedido no banco de dados
    }

}

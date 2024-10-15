package com.eventdriven.orders.controller;

import com.eventdriven.orders.model.CustomerOrdeer;
import com.eventdriven.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//O controlador será responsável por expor as rotas da AP

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<CustomerOrdeer> createOrder(CustomerOrdeer order) {
        CustomerOrdeer newOrder = orderService.createOrder(order);
        return ResponseEntity.ok(newOrder);
    }

}

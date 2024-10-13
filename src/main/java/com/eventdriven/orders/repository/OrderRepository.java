package com.eventdriven.orders.repository;

import com.eventdriven.orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

//O repositório OrderRepository será responsável por interagir com o banco de dados

public interface OrderRepository extends JpaRepository<Order, Long> {
}

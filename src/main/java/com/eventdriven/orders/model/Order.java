package com.eventdriven.orders.model;

//A entidade Order será o modelo do pedido que será armazenado no banco de dados. Crie a classe na pasta model.

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId; // ID do cliente
    private Date orderDate; // Data do pedido
    private Double totalAmount; // Valor total do pedido


}

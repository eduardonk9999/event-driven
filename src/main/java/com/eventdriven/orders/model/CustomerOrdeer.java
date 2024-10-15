package com.eventdriven.orders.model;

//A entidade Order será o modelo do pedido que será armazenado no banco de dados. Crie a classe na pasta model.

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "`customer_order`") // Nome alterado aqui
@Data
public class CustomerOrdeer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "total_amount")
    private Float totalAmount;

}

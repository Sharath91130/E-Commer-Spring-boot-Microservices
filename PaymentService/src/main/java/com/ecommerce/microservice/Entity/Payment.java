package com.ecommerce.microservice.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "s_payments")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private String paymentStatus; 

    private String paymentMode;  

    private double amount;

    private LocalDateTime paymentDate;
}

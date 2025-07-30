package com.ecommerce.microservice.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "s_payments")
@Data
@Getter
@Setter
@AllArgsConstructor

public class Payment {

    public Payment(Long orderId, String paymentStatus, String paymentMode, double amount, LocalDateTime paymentDate) {
		super();
		this.orderId = orderId;
		this.paymentStatus = paymentStatus;
		this.paymentMode = paymentMode;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private String paymentStatus; 

    private String paymentMode;  

    private double amount;

    private LocalDateTime paymentDate;
}

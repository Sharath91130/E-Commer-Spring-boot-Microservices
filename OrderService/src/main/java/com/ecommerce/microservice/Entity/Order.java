package com.ecommerce.microservice.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sharath_order")
@Data
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	
	
	private Integer userId;
	
	
	private Double amount;
	
	
	
	private String status;
	
	
	private Integer product;
	
	

	
	}

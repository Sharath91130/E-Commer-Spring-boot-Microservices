package com.ecommerce.microservice.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;



@Data
@Component
public class Payment implements Serializable{

   

    private Integer orderId;

    private String paymentStatus; 

    private String paymentMode;  
    private double amount;

    private LocalDateTime paymentDate;
}

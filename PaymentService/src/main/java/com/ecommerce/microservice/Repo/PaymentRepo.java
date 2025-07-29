package com.ecommerce.microservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.microservice.Entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment,Integer> {

}

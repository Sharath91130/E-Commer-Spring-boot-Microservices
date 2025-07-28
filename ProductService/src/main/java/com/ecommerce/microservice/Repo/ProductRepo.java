package com.ecommerce.microservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.microservice.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}

package com.ecommerce.microservice.Entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "sharath_product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private Double price;

    private Integer stockQuantity;

    private String category;

}

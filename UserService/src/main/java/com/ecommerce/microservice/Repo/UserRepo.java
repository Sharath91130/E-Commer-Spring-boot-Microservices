package com.ecommerce.microservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.microservice.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}

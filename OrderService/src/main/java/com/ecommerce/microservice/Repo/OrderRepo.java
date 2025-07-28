package com.ecommerce.microservice.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.microservice.Entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {
	
	@Query("select o from Order o where o.userId=:userId")
	public List<Order> findByUserId( @Param("userId") Integer userId);

}

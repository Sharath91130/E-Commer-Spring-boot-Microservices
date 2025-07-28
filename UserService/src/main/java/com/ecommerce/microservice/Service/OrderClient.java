package com.ecommerce.microservice.Service;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "OrderService",url = "http://localhost:8081")
public interface OrderClient {
	
	@GetMapping("/order/getByUser/{id}")
	public List<Map<String, Object>> getOrder(@PathVariable Integer id);
	
	@GetMapping("/order/getByUserName/order-with-products/{id}")
	public List<Map<String, Object>> getOrderwithProducts(@PathVariable Integer id);

}

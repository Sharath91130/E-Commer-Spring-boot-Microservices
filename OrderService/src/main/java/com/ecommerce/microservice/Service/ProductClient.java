package com.ecommerce.microservice.Service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name = "ProductService")

public interface ProductClient {
	
@GetMapping("/product/get/{id}")
	public Map<String, Object>  getProduct(@PathVariable Integer id);
		
	

}

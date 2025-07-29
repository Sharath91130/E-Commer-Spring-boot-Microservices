package com.ecommerce.microservice.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microservice.Entity.Product;
import com.ecommerce.microservice.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	public Product    save(@RequestBody Product product) {
		
		return productService.save(product);
	}
	@GetMapping("/get/{id}")
	public Product get(@PathVariable Integer id) {
		
		return productService.get(id);
		
	}
	@GetMapping("/getprice/{id}")
    public Map<String, Object> getPriceById(@PathVariable Integer id) {
    	Map<String ,Object> map=new HashMap();
    	
    	map.put("Price", productService.get(id).getPrice());
    	return map;
    }
}

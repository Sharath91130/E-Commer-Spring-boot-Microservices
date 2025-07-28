package com.ecommerce.microservice.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ecommerce.microservice.Entity.Order;
import com.ecommerce.microservice.Repo.OrderRepo;

import lombok.Data;

@Service
@Data
public class OrderService {
	private final ProductClient client;
	
	OrderRepo orderRepo;
	public Order save(Order order) {
		
		orderRepo.save(order);
		
		return order;
	}
	public OrderService(OrderRepo orderRepo,ProductClient client) {
		
		this.client = client;
		this.orderRepo = orderRepo;
	}
	
	
	public List<Order> getByUserId(Integer id) {
		
		return  orderRepo.findByUserId(id);
	}

	
	
	public Order getByOrder(Integer id) {
		return orderRepo.findById(id).get();
	}
	public List<Map<String,Object>> getByUserNameAndProuductDetails(Integer id){
		
		
		  List<Order> orders=getByUserId(id);
		  
		  List<Map<String,Object>> orderDetails=new ArrayList<>();

		  
		  int inc=1;
		  for(Order o:orders) {
			  Map<String ,Object> products=new HashMap<>();
			  products.put("order", o);
			  products.put("product"+inc, client.getProduct(o.getProduct()));
			  inc++;
			  orderDetails.add(products);
			  
		  }
			return orderDetails;
		}
}

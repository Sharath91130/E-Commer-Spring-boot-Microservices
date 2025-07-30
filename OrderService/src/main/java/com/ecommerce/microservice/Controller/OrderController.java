package com.ecommerce.microservice.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microservice.Entity.Order;
import com.ecommerce.microservice.Entity.Payment;

import com.ecommerce.microservice.Service.OrderService;
import com.ecommerce.microservice.Service.PaymentClinet;
import com.ecommerce.microservice.Service.ProductClient;

@RestController
@RequestMapping("/order")

public class OrderController {

	
	private final OrderService orderService;
	private final ProductClient client;
	
	private final PaymentClinet pc;
	@Autowired
	private final RabbitTemplate rabbitTemplate;
	
	public OrderController(OrderService orderService, ProductClient client,PaymentClinet clinet) {
		
		this.orderService = orderService;
		this.client = client;
		this.pc = clinet;
		this.rabbitTemplate = new RabbitTemplate();
		
	}


	@PostMapping("/save")
	public Order save(@RequestBody Order order) {
		Map<String, Object> product = client.getProduct(order.getProduct());
		
	String price=String.valueOf(product.get("price"));

	order.setAmount(Double.parseDouble(price));
		
		
	Order o=orderService.save(order);
	Payment payment = order.getPayment();
	payment.setOrderId(order.getOrderId());
	payment.setAmount(o.getAmount());
//rabbitTemplate.convertAndSend(Config.EXCHANGE,Config.ROUTING_KEY,payment);
	
//)
	return o;
	}
	@GetMapping("/getByUser/{id}")
	public List<Order> getByUserId(@PathVariable  Integer id){
		
		
		
	return 	orderService.getByUserId(id);
	}

	@GetMapping("/get/{id}")
	public Map<String, Object> get(@PathVariable  Integer id) {
		Order o=orderService.getByOrder(id);
		
		
		
		Map<String ,Object> product=client.getProduct(o.getProduct());
		
		product.put("Order", o);
		
		
		return product;
		
		
	}
	@GetMapping("/getByUserName/order-with-products/{id}")
	public List<Map<String,Object>> getByUserNameProductsAndOrder(@PathVariable Integer id){
		
		return orderService.getByUserNameAndProuductDetails(id);
		
	}
	

}

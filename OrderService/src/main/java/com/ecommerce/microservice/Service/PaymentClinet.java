package com.ecommerce.microservice.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.microservice.Entity.Payment;

@FeignClient(name="PaymentService",url = "http://localhost:8084")
public interface PaymentClinet {
	@PostMapping("/payment/save")
	public void savePayment(@RequestBody Payment payment);

	

}

package com.ecommerce.microservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microservice.Entity.Payment;
import com.ecommerce.microservice.Repo.PaymentRepo;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	PaymentRepo paymentRepo;
	@PostMapping("/save")
	public Payment   savePayment(@RequestBody Payment payment) {
		
		return paymentRepo.save(payment);
	}

}

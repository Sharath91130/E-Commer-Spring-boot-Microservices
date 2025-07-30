//package com.ecommerce.microservice.RabbitMqConfig;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RabbitMqConfig {
//	
//	public static  final String EXCHANGE="app-exchange";
//	public  static final String ROUTING_KEY="123";
//	
//	public static final String  QUEUE="payment-queue";
//	
//	@Bean
//	public Queue queue() {
//		return new Queue(QUEUE,false);
//	}
//	
//	public TopicExchange exchange() {
//		return new TopicExchange(EXCHANGE);
//	}
//	
//	public Binding  binding() {
//		return BindingBuilder.bind(queue()).to(exchange()).with(ROUTING_KEY);
//	}
//
//}

//package com.ecommerce.microservice.Service;
//
//
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//import com.ecommerce.microservice.Entity.Payment;
//import com.ecommerce.microservice.RabbitMqConfig.RabbitMqConfig;
//
//@Component
//public class PaymentListener {
//
//    @RabbitListener(queues = RabbitMqConfig.QUEUE)
//    public void receivePayment(Payment paymentDto) {
//        System.out.println("Received payment for Order ID: " +paymentDto.getOrderId());
//        System.out.println("Payment Amount: " + paymentDto.getAmount());
//        System.out.println("Payment Mode: " + paymentDto.getPaymentMode());
//        System.out.println("Payment Status: " + paymentDto.getPaymentStatus());
//
//        // TODO: Add your payment processing logic here
//        // e.g., save payment info to database, update order status, etc.
//
//        System.out.println("Payment processed successfully for Order ID: " + paymentDto.getOrderId());
//    }
//}

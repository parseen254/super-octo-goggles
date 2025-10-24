package com.ogenalabs.store;

import org.springframework.context.annotation.Lazy;

// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.stereotype.Service;

// @Service
@Lazy
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(10);
    }
}

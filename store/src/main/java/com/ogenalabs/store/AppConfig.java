package com.ogenalabs.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${payment.method}")
    private String paymentMethod;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PaypalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        PaymentService paymentService = switch(paymentMethod.toLowerCase()) {
            case "stripe" -> stripe();
            case "paypal" -> paypal();
            default -> throw new IllegalArgumentException("Payment method not chosen or invalid: " + paymentMethod);
        };
        return new OrderService(paymentService);
    }
}

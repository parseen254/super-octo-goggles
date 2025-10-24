package com.ogenalabs.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("Message: "+message+"\n");
        System.out.println("Channel: SMS");
    }
}

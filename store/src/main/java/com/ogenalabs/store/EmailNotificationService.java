package com.ogenalabs.store;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("Message: "+message+"\n");
        System.out.println("Channel: Email");
    }
}

package com.ogenalabs.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(@Qualifier("email") NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendNotification(String message){
        notificationService.send(message);
    }

}

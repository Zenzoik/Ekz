package com.example.notification.state;

import com.example.notification.state.NotificationContext;

public class SentState implements NotificationState {
    @Override
    public void handleRequest(NotificationContext context) {
        System.out.println("Notification is SENT. Moving to DELIVERED state...");
        context.setState(new DeliveredState());
    }

    @Override
    public String getStatus() {
        return "SENT";
    }
}

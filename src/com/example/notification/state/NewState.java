package com.example.notification.state;

import com.example.notification.state.NotificationContext;

public class NewState implements NotificationState {
    @Override
    public void handleRequest(NotificationContext context) {
        System.out.println("Notification is in NEW state. Moving to SENT state...");
        context.setState(new SentState());
    }

    @Override
    public String getStatus() {
        return "NEW";
    }
}

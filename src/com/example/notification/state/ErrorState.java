package com.example.notification.state;

import com.example.notification.state.NotificationContext;

public class ErrorState implements NotificationState {
    @Override
    public void handleRequest(NotificationContext context) {
        System.out.println("Notification has ERROR. Restarting might return to NEW state...");
        context.setState(new NewState());
    }

    @Override
    public String getStatus() {
        return "ERROR";
    }
}

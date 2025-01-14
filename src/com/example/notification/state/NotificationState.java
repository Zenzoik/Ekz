package com.example.notification.state;

import com.example.notification.state.NotificationContext;

public interface NotificationState {
    void handleRequest(NotificationContext context);
    String getStatus();
}

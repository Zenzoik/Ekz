package com.example.notification.state;

import com.example.notification.state.NotificationContext;

public class DeliveredState implements NotificationState {
    @Override
    public void handleRequest(NotificationContext context) {
        System.out.println("Notification is DELIVERED. If there's an issue, we might switch to ERROR.");
        // Для прикладу не змінюємо стан далі
        // Але можна, наприклад, перейти до ErrorState
    }

    @Override
    public String getStatus() {
        return "DELIVERED";
    }
}

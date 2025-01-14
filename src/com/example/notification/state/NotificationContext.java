package com.example.notification.state;

public class NotificationContext {
    private NotificationState state;

    public NotificationContext(NotificationState initialState) {
        this.state = initialState;
    }

    public NotificationState getState() {
        return state;
    }

    public void setState(NotificationState state) {
        this.state = state;
    }

    // Ось цей метод має бути публічним і називатися exactly request()
    public void request() {
        // Наприклад, викликаємо handleRequest поточного стану
        state.handleRequest(this);
    }
}

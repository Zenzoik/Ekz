package com.example.notification;

public abstract class NotificationDecorator implements Notification {
    protected Notification wrappedNotification;

    public NotificationDecorator(Notification notification) {
        this.wrappedNotification = notification;
    }

    @Override
    public String getContent() {
        return wrappedNotification.getContent();
    }

    @Override
    public void setContent(String content) {
        wrappedNotification.setContent(content);
    }
}

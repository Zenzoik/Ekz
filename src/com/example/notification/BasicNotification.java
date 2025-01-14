package com.example.notification;

public class BasicNotification implements Notification {
    private String content;

    public BasicNotification(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}

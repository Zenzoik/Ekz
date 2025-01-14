package com.example.notification;

public class User implements NotificationObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Notification notification) {
        System.out.println("User " + name + " received notification: "
                + notification.getContent());
    }
}

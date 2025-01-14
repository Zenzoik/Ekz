package com.example.notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    // === Singleton реалізація ===
    private static NotificationService instance;

    private NotificationService() {
        // приватний конструктор
    }

    public static synchronized NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    // === Observer: список підписників ===
    private List<NotificationObserver> observers = new ArrayList<>();

    // Реєстрація підписників
    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    // Видалення підписників
    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    // Надсилаємо повідомлення всім підписникам
    public void notifyAllObservers(Notification notification) {
        for (NotificationObserver observer : observers) {
            observer.update(notification);
        }
    }
}

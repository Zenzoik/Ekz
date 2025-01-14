package com.example.notification;

public class AdSignatureDecorator extends NotificationDecorator {

    public AdSignatureDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getContent() {
        // Додаємо рекламу або промо-підпис
        return super.getContent() + "\n---\nCheck out our new promotions!";
    }
}

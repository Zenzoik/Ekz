package com.example.notification;

public class EncryptionDecorator extends NotificationDecorator {

    public EncryptionDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getContent() {
        // Умовне "шифрування" для прикладу
        return "[Encrypted] " + super.getContent();
    }
}

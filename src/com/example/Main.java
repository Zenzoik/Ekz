package com.example;

import com.example.payment.*;
import com.example.notification.*;
import com.example.notification.state.*;
import com.example.notification.state.NewState;

public class Main {
    public static void main(String[] args) {

        // === 1. Обробка платежів ===
        // Обираємо метод оплати: картка
        PaymentMethod creditCardMethod = new CreditCardPayment("1234-5678-9012-3456");
        PaymentProcessor processor = new PaymentProcessor(creditCardMethod);
        processor.processPayment(100.0);

        // Або можна спробувати PayPal
        // PaymentMethod paypalMethod = new PayPalPayment("user@example.com");
        // PaymentProcessor paypalProcessor = new PaymentProcessor(paypalMethod);
        // paypalProcessor.processPayment(200.0);

        System.out.println("--------------------------------------------------");

        // === 2. Керування розсилкою повідомлень ===
        NotificationService notificationService = NotificationService.getInstance();

        // Створимо користувачів (підписників)
        User user1 = new User("Iluha");
        User user2 = new User("Dimchik");

        // Додаємо їх у підписники
        notificationService.addObserver(user1);
        notificationService.addObserver(user2);

        // Створюємо базове повідомлення
        Notification basicMessage = new BasicNotification("We have a great discount for you!");

        // Додаємо декоратори:
        // Спочатку рекламний підпис, потім шифрування.
        Notification decoratedMessage = new EncryptionDecorator(
                new AdSignatureDecorator(basicMessage));

        // Розсилаємо повідомлення підписникам
        notificationService.notifyAllObservers(decoratedMessage);

        System.out.println("--------------------------------------------------");

        // === 3. Перевірка стану повідомлень (State) ===
        NotificationContext context = new NotificationContext(new NewState());
        System.out.println("Current State: " + context.getState().getStatus());

        // Перший виклик request() переходить зі стану NEW -> SENT
        context.request();
        System.out.println("Current State: " + context.getState().getStatus());

        // Другий виклик: SENT -> DELIVERED
        context.request();
        System.out.println("Current State: " + context.getState().getStatus());

        // Третій виклик (за потреби) можна додати, щоб, наприклад, перейти до ERROR
        // але в даній реалізації DELIVERED просто залишається DELIVERED,
        // тож можна вручну переключитися в ErrorState:

        context.setState(new ErrorState());
        context.request();  // ERROR -> NEW
        System.out.println("Current State: " + context.getState().getStatus());
    }
}

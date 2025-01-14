package com.example.payment;

public class PayPalPayment implements PaymentMethod {
    private String userEmail;

    public PayPalPayment(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public boolean pay(double amount) {
        // Логіка для списання коштів через PayPal
        System.out.println("Paying " + amount + " using PayPal: " + userEmail);
        // Повертаємо true, ніби завжди успішно
        return true;
    }
}

package com.example.payment;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        // Логіка для списання коштів з картки
        System.out.println("Paying " + amount + " using Credit Card: " + cardNumber);
        // Повертаємо true, ніби завжди успішно
        return true;
    }
}

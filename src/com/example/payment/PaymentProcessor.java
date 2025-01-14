package com.example.payment;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        boolean success = paymentMethod.pay(amount);
        if (success) {
            System.out.println("Payment processed successfully!");
        } else {
            System.out.println("Payment failed!");
        }
    }
}

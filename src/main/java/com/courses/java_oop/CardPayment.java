package com.courses.java_oop;

public class CardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("Paid $%s using Credit/Debit Card.%n",amount);
    }
}

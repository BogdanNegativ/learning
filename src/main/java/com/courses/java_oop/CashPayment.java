package com.courses.java_oop;

public class CashPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("Paid $%s in Cash.%n",amount);
    }
}

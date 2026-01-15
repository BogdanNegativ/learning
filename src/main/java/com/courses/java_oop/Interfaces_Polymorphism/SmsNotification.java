package com.courses.java_oop.Interfaces_Polymorphism;

public class SmsNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

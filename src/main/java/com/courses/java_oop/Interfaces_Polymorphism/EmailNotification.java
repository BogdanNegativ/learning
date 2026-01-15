package com.courses.java_oop.Interfaces_Polymorphism;

public class EmailNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}

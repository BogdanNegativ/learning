package com.courses.java_oop.Abstract_Class_Interface.Interfaces.Task2;

public class Messenger {
    public void processMessage(String text, Encryptable strategy) {
        System.out.println("Original text: " + text);
        String encrypted = strategy.encrypt(text);
        System.out.println("Encrypted text: " + encrypted);
        String decrypted = strategy.decrypt(encrypted);
        System.out.println("Decrypted text: " + decrypted);
    }
}


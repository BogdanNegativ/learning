package com.courses.java_oop.Abstract_Class_Interface.Interfaces.Task2;

public class ReverseEncryptor implements Encryptable{
    @Override
    public String encrypt(String data) {
        return new StringBuilder(data).reverse().toString();
    }

    @Override
    public String decrypt(String encryptedData) {
        return new StringBuilder(encryptedData).reverse().toString();
    }
}

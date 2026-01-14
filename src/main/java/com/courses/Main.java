package com.courses;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bohdan",23);
        person.printInfo();

        Car car = new Car("Mercedes");
        car.printSpeed();
        car.accelerate(120);
        car.printSpeed();
        car.accelerate(-150);
        car.printSpeed();
    }
}
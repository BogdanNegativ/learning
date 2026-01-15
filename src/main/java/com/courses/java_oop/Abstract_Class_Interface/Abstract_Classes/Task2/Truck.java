package com.courses.java_oop.Abstract_Class_Interface.Abstract_Classes.Task2;

public class Truck extends Vehicle{
    public Truck(String model, double fuelLevel) {
        super(model, fuelLevel);
    }

    @Override
    public void drive(double distance) {
        double requiredFuel = distance * 0.3;
        if (fuelLevel >= requiredFuel) {
            fuelLevel -= requiredFuel;
            System.out.println(model + " drove " + distance + " units.");
        } else {
            System.out.println("Insufficient fuel for " + model);
        }
    }
}

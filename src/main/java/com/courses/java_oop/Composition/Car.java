package com.courses.java_oop.Composition;

public class Car {
    Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    public void startCar(){
        System.out.println("Car starting...");
        engine.work();
    }
}

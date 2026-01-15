package com.courses.java_oop.Abstract_Class_Interface.Abstract_Classes.Task1;

public abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateMonthlySalary();

    public void displayInfo() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Month salary: " + calculateMonthlySalary());
    }
}

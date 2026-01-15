package com.courses.java_oop.Abstract_Class_Interface.Abstract_Classes.Task1;

public class FullTimeEmployee extends Employee {
    private final double yearlySalary;

    public FullTimeEmployee(String name, int id, double yearlySalary) {
        super(name, id);
        this.yearlySalary = yearlySalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return yearlySalary / 12;
    }
}

package com.courses;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Bohdan",23);
//        person.printInfo();
//
//        Car car = new Car("Mercedes");
//        car.printSpeed();
//        car.accelerate(120);
//        car.printSpeed();
//        car.accelerate(-150);
//        car.printSpeed();

        Scanner scanner = new Scanner(System.in);
        Divider divider = new Divider();
        boolean running = true;

        while (running) {
            try {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();

                System.out.print("Enter second number: ");
                int b = scanner.nextInt();

                int result = divider.divide(a, b);
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid integers only.");
                scanner.next(); // clear invalid input
            }

            try {
                Divider.readNumberFromFile();
            } catch (IOException e) {
                System.out.println("Checked Exception Caught: " + e.getMessage());
            }

            Divider.demonstrateUncheckedException();

            System.out.print("Do you want to continue? (Y/N): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("Y")) {
                running = false;
                System.out.println("Program terminated.");
            }
        }
        scanner.close();
    }
}
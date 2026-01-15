package com.courses;

import com.courses.java_oop.Abstract_Class_Interface.Abstract_Classes.Task1.Contractor;
import com.courses.java_oop.Abstract_Class_Interface.Abstract_Classes.Task1.Employee;
import com.courses.java_oop.Abstract_Class_Interface.Abstract_Classes.Task1.FullTimeEmployee;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*  ---Object---
        Person person = new Person("Bohdan",23);
        person.printInfo();

        Car car = new Car("Mercedes");
        car.printSpeed();
        car.accelerate(120);
        car.printSpeed();
        car.accelerate(-150);
        car.printSpeed();
         */

        /* ---handling exceptions---
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
         */

        /* ---Java OOP---
        //1.Encapsulation
        BankAccount account = new BankAccount("Bohdan", 0);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        account.deposit(155.35);
        System.out.println(account.getBalance());
        account.withdraw(45.75);
        System.out.println(account.getBalance());
        account.deposit(-48.78);
        System.out.println(account.getBalance());
        account.withdraw(-500);
        System.out.println(account.getBalance());

        //2.Inheritance
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();

        //3.Polymorphism
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }

        //4.Abstraction
        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        payment1.pay(125.2);
        payment2.pay(21);

        //5.Interfaces & Polymorphism
        NotificationService notification;
        notification = new EmailNotification();
        notification.send("Your had new message");
        notification = new SmsNotification();
        notification.send("Your key is 22468");

        //6.Composition
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.startCar();
         */

        //Abstract Classes Task1
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Bob", 15, 887654));
        employees.add(new Contractor("Lob", 55, 488, 48));
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
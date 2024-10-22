package org.example;

import java.util.Scanner;  // Import the Scanner class

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Calculator
        Calculator calculator = new Calculator();

        Scanner myObj  = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter A number");
        int a = myObj.nextInt();  // Read user input
        System.out.println("Number A is: " + a);  // Output user input
        System.out.println("Enter B number");
        int b = myObj.nextInt();  // Read user input
        System.out.println("Number B is: " + b);  // Output user input

        // Тестуємо методи
//        int a = 10;
//        int b = 5;

        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + calculator.multiple(a, b));
        try {
            System.out.println("Division: " + calculator.divide(a, b));
            System.out.println("Division by percent: " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
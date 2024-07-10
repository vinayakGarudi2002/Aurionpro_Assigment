package com.aurionpro.operator;

import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Relational Operators----|");
        System.out.println("");
        System.out.println("Application will prompt to enter two numerical inputs to demonstrate various relational operations");
        System.out.println("");

       
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.println("");
        System.out.println("|----Operators----|");
        System.out.println("");

       
        System.out.println("1. Equal to (number1 == number2): " + (number1 == number2));

        
        System.out.println("2. Not Equal to (number1 != number2): " + (number1 != number2));

        
        System.out.println("3. Less than (number1 < number2): " + (number1 < number2));

        
        System.out.println("4. Less than or equal to (number1 <= number2): " + (number1 <= number2));

       
        System.out.println("5. Greater than (number1 > number2): " + (number1 > number2));

       
        System.out.println("6. Greater than or equal to (number1 >= number2): " + (number1 >= number2));

        System.out.println("");
        System.out.println("------------------");
    }
}


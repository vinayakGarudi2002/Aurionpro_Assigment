package com.aurionpro.operator;

import java.util.Scanner;

public class BitwiseOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Bitwise Operators----|");
        System.out.println("");
        System.out.println("Application will prompt to enter two numerical inputs to demonstrate various bitwise operations");
        System.out.println("");

        
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.println("");
        System.out.println("|----Operators----|");
        System.out.println("");

        
        System.out.println("1. Bitwise AND (number1 & number2): " + (number1 & number2));

        
        System.out.println("2. Bitwise OR (number1 | number2): " + (number1 | number2));

        
        System.out.println("3. Bitwise XOR (number1 ^ number2): " + (number1 ^ number2));

        
        System.out.println("4. Bitwise Complement (~number1): " + (~number1));

        System.out.println("");
        System.out.println("------------------");
    }
}

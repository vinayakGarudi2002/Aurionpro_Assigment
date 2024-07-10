package com.aurionpro.operator;

import java.util.Scanner;

public class AssignmentOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Assignment Operators----|");
        System.out.println("");
        System.out.println("Application will prompt to enter a numerical input to demonstrate various assignment operations");
        System.out.println("");

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("");
        System.out.println("|----Operators----|");
        System.out.println("");

        
        int result = number;
        System.out.println("1. Simple Assignment (result = number): " + result);

       
        result += 5;
        System.out.println("2. Addition Assignment (result += 5): " + result);

        
        result -= 3;
        System.out.println("3. Subtraction Assignment (result -= 3): " + result);

     
        result *= 2;
        System.out.println("4. Multiplication Assignment (result *= 2): " + result);

       
        result /= 4;
        System.out.println("5. Division Assignment (result /= 4): " + result);

       
        result %= 3;
        System.out.println("6. Modulus Assignment (result %= 3): " + result);

        System.out.println("");
        System.out.println("------------------");
    }
}

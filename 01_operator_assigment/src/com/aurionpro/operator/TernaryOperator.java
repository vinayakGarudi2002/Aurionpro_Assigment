package com.aurionpro.operator;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Ternary Operator----|");
        System.out.println("");
        System.out.println("Application will prompt to enter a numerical input to demonstrate the ternary operator");
        System.out.println("");

       
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("");
        System.out.println("|----Operators----|");
        System.out.println("");

       
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result + ".");

        System.out.println("");
        System.out.println("------------------");
    }
}

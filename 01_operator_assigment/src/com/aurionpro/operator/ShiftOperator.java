package com.aurionpro.operator;

import java.util.Scanner;

public class ShiftOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Shift Operators----|");
        System.out.println("");
        System.out.println("Application will prompt to enter a numerical input and the number of places to shift to demonstrate various shift operations");
        System.out.println("");

       
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        
        System.out.print("Enter number of places to shift: ");
        int places = scanner.nextInt();

        System.out.println("");
        System.out.println("|----Operators----|");
        System.out.println("");

       
        System.out.println("1. Left Shift (number << places): " + (number << places));

       
        System.out.println("2. Signed Right Shift (number >> places): " + (number >> places));

        
        System.out.println("3. Unsigned Right Shift (number >>> places): " + (number >>> places));

        System.out.println("");
        System.out.println("------------------");
    }
}

package com.aurionpro.operator;

import java.util.Scanner;

public class UnaryOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Unary Operators----|");
        System.out.println("");
        System.out.println("Application will prompt to enter a numerical input and a boolean input to demonstrate various unary operations");
        System.out.println("");

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = scanner.nextBoolean();

        System.out.println("");
        System.out.println("|----Operators----|");
        System.out.println("");

      
        System.out.println("1. Unary Minus (-number): " + (-number));

        
        System.out.println("2. Unary Plus (+number): " + (+number));

    
        System.out.println("3. Pre-Increment (++number): " + (++number));

      
        number--; // Reset 
        System.out.println("4. Post-Increment (number++): " + (number++));
        System.out.println("   After Post-Increment, number: " + number);

 
        System.out.println("5. Pre-Decrement (--number): " + (--number));

     
        number++; // Reset 
        System.out.println("6. Post-Decrement (number--): " + (number--));
        System.out.println("   After Post-Decrement, number: " + number);

     
        System.out.println("7. Logical NOT (!bool): " + (!bool));

        System.out.println("");
        System.out.println("------------------");
    }
}

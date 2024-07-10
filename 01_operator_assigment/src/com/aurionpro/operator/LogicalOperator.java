package com.aurionpro.operator;

import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Logical Operators----|");
        System.out.println("");
        System.out.println("Application will prompt to enter two boolean inputs to demonstrate various logical operations");
        System.out.println("");

        
        System.out.print("Enter boolean1 (true/false): ");
        boolean boolean1 = scanner.nextBoolean();

        System.out.print("Enter boolean2 (true/false): ");
        boolean boolean2 = scanner.nextBoolean();

        System.out.println("");
        System.out.println("|----Operators----|");
        System.out.println("");

        
        System.out.println("1. Logical AND (boolean1 && boolean2): " + (boolean1 && boolean2));

       
        System.out.println("2. Logical OR (boolean1 || boolean2): " + (boolean1 || boolean2));

        
        System.out.println("3. Logical NOT (!boolean1): " + (!boolean1));

        
        System.out.println("4. Logical NOT (!boolean2): " + (!boolean2));

        System.out.println("");
        System.out.println("------------------");
    }
}

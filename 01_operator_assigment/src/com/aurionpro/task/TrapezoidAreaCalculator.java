package com.aurionpro.task;

import java.util.Scanner;

public class TrapezoidAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Trapezoid Area Calculator----|");
        System.out.println("");
        System.out.println("Application will prompt to enter the lengths of the bases and the height to calculate the area of the trapezoid");
        System.out.println("");

        
        System.out.print("Enter the length of the first base: ");
        int base1 = scanner.nextInt();

        
        System.out.print("Enter the length of the second base: ");
        int base2 = scanner.nextInt();

        
        System.out.print("Enter the height: ");
        int height = scanner.nextInt();

        System.out.println("");
        System.out.println("|----Calculating Area----|");
        System.out.println("");

       
        double area = ((base1 + base2) / 2) * height;

        
        System.out.println("The area of the trapezoid is: " + area);

        System.out.println("");
        System.out.println("------------------");
    }
}

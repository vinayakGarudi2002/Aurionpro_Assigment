package com.aurionpro.task;

import java.util.Scanner;

public class DistanceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Distance Calculator----|");
        System.out.println("");
        System.out.println("Application will prompt to enter the coordinates of two points to calculate the distance between them");
        System.out.println("");

        
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();

        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();

       
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();

        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        System.out.println("");
        System.out.println("|----Calculating Distance----|");
        System.out.println("");

      
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        
        System.out.println("The distance between  points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);

        System.out.println("");
        System.out.println("------------------");
    }
}

package com.aurionpro.task;

import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Compound Interest Calculator----|");
        System.out.println("");
        System.out.println("Application will prompt to enter the principal amount, rate of interest, and time to calculate compound interest");
        System.out.println("");

        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

       
        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

        
        System.out.print("Enter the number of times interest is compounded per year: ");
        int numberOfCompounds = scanner.nextInt();

        System.out.println("");
        System.out.println("|----Calculating Compound Interest----|");
        System.out.println("");

        
        double compoundInterest = principal * Math.pow((1 + rate / (numberOfCompounds)), numberOfCompounds * time) - principal;

        
        System.out.println("The compound interest is: " + compoundInterest);

        System.out.println("");
        System.out.println("------------------");
    }
}
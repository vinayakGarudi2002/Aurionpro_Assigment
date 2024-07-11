package com.aurionpro.loop.assigment;

import java.util.Scanner;

public class AtmSimulation {

    public static void main(String[] args) {
    	
        int currentBalance = 1000; 
        boolean exitStatus = false; 

        Scanner scanner = new Scanner(System.in);

        while (!exitStatus) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    
                    System.out.println("Your current balance is: Rs" + currentBalance);
                    break;

                case 2:
                    
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    
                    if (depositAmount > 0) {
                        currentBalance += depositAmount;
                        System.out.println("You have deposited Rs" + depositAmount + ". Your new balance is Rs" + currentBalance);
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;

                case 3:
                    
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    
                    if (withdrawAmount > 0 && withdrawAmount <= currentBalance) {
                        currentBalance -= withdrawAmount;
                        System.out.println("You have withdrawn Rs" + withdrawAmount + ". Your new balance is Rs" + currentBalance);
                    } else if (withdrawAmount > currentBalance) {
                        System.out.println("Insufficient balance. Please enter a valid amount.");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;

                case 4:
                   
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    exitStatus = true;
                    break;

                default:
                    
                    System.out.println("Invalid input. Please select a correct option.");
                    break;
            }
            System.out.println();
        }

        
    }
}

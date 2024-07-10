package com.aurionpro.task;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("|----Time Converter----|");
        System.out.println("");
        System.out.println("Application will prompt to enter the number of minutes to convert it into hours and minutes");
        System.out.println("");

      
        System.out.print("Enter the number of minutes: ");
        int totalMinutes = scanner.nextInt();

        System.out.println("");
        System.out.println("|----Converting Time----|");
        System.out.println("");

   
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

   
        System.out.println(totalMinutes + " minutes is equals to " + hours + " hours and " + minutes + " minutes.");

        System.out.println("");
        System.out.println("------------------");
    }
}

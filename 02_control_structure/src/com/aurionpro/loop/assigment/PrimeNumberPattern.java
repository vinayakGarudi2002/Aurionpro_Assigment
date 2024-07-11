package com.aurionpro.loop.assigment;

import java.util.Scanner;

public class PrimeNumberPattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Lines: ");
        int lines = scanner.nextInt();

        
        int num = 2; 

      
        for (int i = 1; i <= lines; i++) {
           
            for (int j = 1; j <= i; j++) {
            	
                while (true) {
                    boolean checkPrime = true;
                   
                    for (int k = 2; k < num; k++) {
                             if (num % k == 0) {
                                checkPrime = false;
                                break;
                            }
                        }
                    

                    if (checkPrime) {
                        System.out.print(num + "\t");
                        num++;
                        break;
                    }
                    num++;
                }
            }
            System.out.println();
        }

        
    }
}

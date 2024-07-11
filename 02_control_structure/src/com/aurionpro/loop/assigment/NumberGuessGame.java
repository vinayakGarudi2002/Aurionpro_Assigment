package com.aurionpro.loop.assigment;

import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int attempts=0;
		boolean exitStatus=false;
		int randomNumber = 1 + (int)(Math.random() * 100);
		//System.out.println(randomNumber);// un comment for testing
		
		while(!exitStatus) {
			
			if(attempts>=5) {
				System.out.println("Maximum Number of attempts Completed "+ "Required Number was: "+randomNumber);
				
				System.out.println("Do you want to play the game again: yes-y / no-n");
				char ch = scanner.next().charAt(0);
				
				if(ch=='y') {
					attempts=0;
					randomNumber = 1 + (int)(Math.random() * 100);
					//System.out.println(randomNumber);// un comment for testing
				}else {
					exitStatus=true;
					break;
				}
			}
			
			
			System.out.println("Guess a Number: ");
			int number = scanner.nextInt();
			
			attempts++;
			
			if(number==randomNumber) {
				System.out.println("You won: in attempt: "+attempts);
				
				System.out.println("Do you want to play the game again: yes-y / no-n");
				char ch = scanner.next().charAt(0);
				
				if(ch=='y') {
					attempts=0;
					randomNumber = 1 + (int)(Math.random() * 100);
					//System.out.println(randomNumber);// un comment for testing
				}else {
					exitStatus=true;
					break;
				}
				
			}else if(number<randomNumber) {
				System.out.println("Sorry too low");
			}else {
				System.out.println("Sorry too high");
			}
			
			
		}
		
		System.out.println("Thank you for Playing Game");
		

	}

}

package com.aurionpro.loop.assigment;

import java.util.Scanner;

public class PigGame {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		int turn=1;
		int points=0; // goal(20)
		int die;
		
		System.out.println("Turn: "+turn);
		while(points<20) {
			
			//System.out.println("Curent Turn: "+turn);
			
			System.out.println("Do you want to Roll or hold? (r/h): ");
			char ch = scanner.next().charAt(0);
			
			if(ch=='r') {
				die=1 + (int)(Math.random() * 6);
				System.out.println("Die: "+die);
				
				if(die==1) {
					points=0;
					
					System.out.println("Score for turn "+turn);
					System.out.println("Total Score: "+points);
					
					turn++;
					
					System.out.println("Turn: "+turn);
				}else {
					points+=die;
				}
				
				//System.out.println("Curent points: "+points);
			}else {
				System.out.println("Score for turn "+turn);
				System.out.println("Total Score: "+points);
				turn++;
				
				System.out.println("Turn: "+turn);
			}
			
			System.out.println("");
		}
		
		System.out.println("Total Score: "+points);
		System.out.println("You won with: "+turn+" turns");
		System.out.println("Game Over");

	}

}

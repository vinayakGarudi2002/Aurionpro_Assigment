package com.aurionpro.control.assigment;

import java.util.Scanner;

public class TreasureHuntProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("|--------Welcome to Treasure Land---------|");
		System.out.println("------------------------------------------");
		System.out.println("|--Mission to find Treasure Begins........");
		System.out.println("");
		
		System.out.println("You have two option right and left: ");
		System.out.println("To choose right enter 'r' and for left enter 'l': ");
		
		char move=scanner.next().charAt(0);
		
		if(move!='l') {
			System.out.println("Fall into a hole");
			System.out.println("Game Over");
			
		}else{
			System.out.println("You have two option swim and wait: ");
			System.out.println("To choose swim enter 's' and for wait enter 'w': ");
			
			 move=scanner.next().charAt(0);
			 
			 if(move!='w') {
				 System.out.println("Attacked by trout");
				 System.out.println("Game Over");
				 
			 }else {
				 
				    System.out.println("In front of there is Door of three color red , yellow and blue: ");
					System.out.println("To choose red enter 'r',yellow enter 'y' and for blue enter 'b': ");
					
					 move=scanner.next().charAt(0);
					 
					switch (move) {
					case 'r':
						System.out.println("Burned By Fire");
						System.out.println("Game Over");
						break;
						
                    case 'y':
						System.out.println("You Win!");
						break;
						
                    case 'b':
						System.out.println("Eaten By Beast");
						System.out.println("Game Over");
						break;
						
					default:
						System.out.println("Game Over");
						break;
					}
				 
			 }
		}
		
		System.out.println("------------------------------------------");
		
	}

}

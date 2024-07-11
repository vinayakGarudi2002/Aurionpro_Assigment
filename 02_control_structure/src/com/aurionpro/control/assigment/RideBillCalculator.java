package com.aurionpro.control.assigment;

import java.util.Scanner;

public class RideBillCalculator {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("|--------Welcome to Theme Park---------|");
		System.out.println("------------------------------------");
		
		
		System.out.println("Enter Your Height: ");
		int height=scanner.nextInt();
		
		int charge=0;
		
		
		if(height<=120) {
			System.out.println("Not allowed to Ride");
		}else {
			
			System.out.println("Enter Your Age: ");
			int age=scanner.nextInt();
			
			System.out.println("Do You Want Photos if yes Enter y else n: ");
			char wantPhoto=scanner.next().charAt(0);
			
			if(age<12) {
				charge=charge+5;
				
			}else if(age>=12 && age<18) {
				charge=charge+7;
				
			}else if(age>=18 && age<45) {
				charge=charge+12;
				
			}else {
				charge=charge+0;
			}
			
			
			if(wantPhoto=='y') {
			    charge=charge+3;
			}
			
			System.out.println("Total Bill of Ride: "+charge);
		
		}
		
		System.out.println("------------------------------------");
	}
	

}

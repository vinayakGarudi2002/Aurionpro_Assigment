package com.aurionpro.control.assigment;

import java.util.Scanner;

public class CurrencyCounter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("|--------Welcome to My Atm---------|");
		System.out.println("------------------------------------");
		System.out.println("Enter Amount: ");
		int amount=scanner.nextInt();
		
		if(amount>50000) {
			System.out.println("Amount exceeds withdrwal limit of 50000");
		}else if(amount%100!=0) {
		System.out.println("Amount should be in multiples of 100");	
		}else {
			
			int remaingAmount=amount;
			
			int numberOf2000Notes=remaingAmount/2000;
			remaingAmount=remaingAmount%2000;
			
			int numberOf500Notes=remaingAmount/500;
			remaingAmount=remaingAmount%500;
			
			int numberOf200Notes=remaingAmount/200;
			remaingAmount=remaingAmount%200;
			
			int numberOf100Notes=remaingAmount/100;
			remaingAmount=remaingAmount%100;
			System.out.println("");
			System.out.println(
				    (numberOf2000Notes != 0) ? "Two Thousend: " + numberOf2000Notes : "" 
				);
			
			System.out.println(
				    (numberOf500Notes != 0) ? "Five Hundered: " + numberOf500Notes : "" 
				);
			
			System.out.println(
				    (numberOf200Notes != 0) ? "Two Hundered: " + numberOf200Notes : "" 
				);
			
			System.out.println(
				    (numberOf100Notes != 0) ? "one Hundered: " + numberOf100Notes : "" 
				);
			System.out.println("Transaction Completed Succesfuly ");
			System.out.println("");
			System.out.println("------------------------------------");
		}
		
		
	}

}

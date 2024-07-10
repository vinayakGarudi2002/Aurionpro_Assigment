package com.aurionpro.operator;

import java.util.Scanner;

public class ArithmaticOperator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("|----Arithmetic Operators----|");
		System.out.println("");
		System.out.println("Application will prompt to enter two numerical inputs to demonstrate various arithmatic operation");
		System.out.println("");
		System.out.println("Number1: ");
		
		int number1=scanner.nextInt();
		
		System.out.println("Number2: ");
		
		int number2=scanner.nextInt();
		
		System.out.println("");
		System.out.println("|----Operators----|");
		System.out.println("");
		System.out.println("1. Addition - '+' ");
		
		System.out.println("Number1 + Number2: "+(number1+number2));
		
		System.out.println("");
		System.out.println("2. Subraction - '-' ");
		
		System.out.println("Number1 - Number2: "+(number1-number2));
		
		System.out.println("");
		System.out.println("3. Multiplication - '*' ");
		
		System.out.println("Number1 * Number2: "+(number1*number2));
		
		System.out.println("");
		System.out.println("4. Division - '/' ");
		
		System.out.println("Number1 / Number2: "+(number1/number2)); //exception-zero
		
		System.out.println("");
		System.out.println("5. Modulus - '%' ");
		
		System.out.println("Number1 % Number2: "+(number1%number2));
		
		System.out.println("");
		System.out.println("------------------");
		
		
		
		
		
	}

}

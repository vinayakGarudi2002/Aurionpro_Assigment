package com.aurionpro.operator;

public class OperatorTest {

	public static void main(String[] args) {
		int number1=2;
		int number2=4;
		
		System.out.println((number1==number2) & (number2>number1));
		System.out.println((number1<number2) & (number2>number1));
		
		System.out.println((number1<number2) && (number2>number1));
		
		System.out.println(number1++);
		System.out.println(number1);
		
		System.out.println(number1++ + number2 );
		
		System.out.println(--number1);
		System.out.println(number1);
		System.out.println((number1==number2)?"true":"false");
		

	}

}

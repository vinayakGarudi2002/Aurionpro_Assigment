package com.aurionpro.task;

import java.util.Scanner;

public class WaterBillCalculator {

public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number of Units Consumed: ");
		
		int units=scanner.nextInt();
		int charge=0;
		int meter_charge=75;
		
		
		if(units<=100) {
			
			charge=units*5;
		}else {
			if(units<=250) {
				charge=100*5;
				charge=(units-100)*10+charge;
			}else {
				charge=100*5;
				charge=250*10+charge;
				charge=(units-350)*20+charge;
			}
		}
		
		int totalBill=charge+meter_charge;
		
		System.out.println("Total Charged of water bill is: "+totalBill+" Rs");
		
		
	}

}

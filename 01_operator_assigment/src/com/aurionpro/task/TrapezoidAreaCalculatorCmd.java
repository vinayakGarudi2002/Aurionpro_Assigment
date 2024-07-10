package com.aurionpro.task;

public class TrapezoidAreaCalculatorCmd {
	  public static void main(String[] args) {
	
	        System.out.println("");
	        System.out.println("|----Trapezoid Area Calculator----|");
	        System.out.println("");
	        System.out.println("Application received the lengths of the bases and the height to calculate the area of the trapezoid");
	        System.out.println("");

	 
	        int base1 = Integer.parseInt(args[0]);
	        int base2 = Integer.parseInt(args[1]);
	        int height = Integer.parseInt(args[2]);

	        System.out.println("Length of the first base: " + base1);
	        System.out.println("Length of the second base: " + base2);
	        System.out.println("Height: " + height);

	        System.out.println("");
	        System.out.println("|----Calculating Area----|");
	        System.out.println("");

	      
	        double area = ((base1 + base2) / 2) * height;

	        System.out.println("The area of the trapezoid is: " + area);

	        System.out.println("");
	        System.out.println("------------------");
	    }
}

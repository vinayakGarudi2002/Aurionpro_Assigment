package com.aurionpro.task;

public class BMICalculatorCmd {
	 public static void main(String[] args) {
	        

	        System.out.println("");
	        System.out.println("|----BMI Calculator----|");
	        System.out.println("");
	       

	        
	        
	        double weight = Double.parseDouble(args[0]);

	        
	        
	        double height = Double.parseDouble(args[1]);
	        System.out.println("Weight (in kilograms): "+weight);
	        System.out.println("Height (in meters): "+height);
	        System.out.println("");
	        System.out.println("|----Calculating BMI----|");
	        System.out.println("");

	        
	        double bmi = weight / (height * height);

	        
	        
	       // String bmiCategory= (bmi<18.5)?"Under Weight":"Normal to Over Weight";
	        
	        System.out.println("Your BMI is: " + bmi);
	       // System.out.println("Your BMI is: "+bmiCategory);
	        

	        System.out.println("");
	        System.out.println("------------------");
	    }
}
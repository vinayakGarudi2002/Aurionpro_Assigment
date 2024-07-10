package com.aurionpro.task;

public class CompoundInterestCalculatorCmd {
	public static void main(String[] args) {
       

        System.out.println("");
        System.out.println("|----Compound Interest Calculator----|");
        System.out.println("");
        System.out.println("Application received principal amount, rate of interest, time, and number of times interest is compounded per year to calculate compound interest");
        System.out.println("");

        
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        int time = Integer.parseInt(args[2]);
        int numberOfCompounds = Integer.parseInt(args[3]);

        System.out.println("principal: " + principal);
        System.out.println("rate: " + rate);
        System.out.println("time: " + time);
        System.out.println("numberOfCompounds: " + numberOfCompounds);

        System.out.println("");
        System.out.println("|----Calculating Compound Interest----|");
        System.out.println("");

       
        double compoundInterest = principal * Math.pow((1 + rate / (numberOfCompounds * 100)), numberOfCompounds * time) - principal;

        System.out.println("The compound interest is: " + compoundInterest);

        System.out.println("");
        System.out.println("------------------");
    }
}

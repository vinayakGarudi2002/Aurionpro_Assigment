package com.aurionpro.task;

public class DistanceCalculatorCmd {
	public static void main(String[] args) {
        

        System.out.println("");
        System.out.println("|----Distance Calculator----|");
        System.out.println("");
        System.out.println("Application received coordinates of two points to calculate the distance between them");
        System.out.println("");

        
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        System.out.println("x1: " + x1);
        System.out.println("y1: " + y1);
        System.out.println("x2: " + x2);
        System.out.println("y2: " + y2);

        System.out.println("");
        System.out.println("|----Calculating Distance----|");
        System.out.println("");

       
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);

        System.out.println("");
        System.out.println("------------------");
    }
}

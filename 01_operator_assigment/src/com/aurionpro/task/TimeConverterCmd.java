package com.aurionpro.task;

public class TimeConverterCmd {
	
	public static void main(String[] args) {
     

        System.out.println("");
        System.out.println("|----Time Converter----|");
        System.out.println("");
        System.out.println("Application received the number of minutes to convert it into hours and minutes");
        System.out.println("");

      
        int totalMinutes = Integer.parseInt(args[0]);

        System.out.println("Total minutes: " + totalMinutes);

        System.out.println("");
        System.out.println("|----Converting Time----|");
        System.out.println("");

      
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(totalMinutes + " minutes is equals to " + hours + " hours and " + minutes + " minutes.");

        System.out.println("");
        System.out.println("------------------");
    }
}

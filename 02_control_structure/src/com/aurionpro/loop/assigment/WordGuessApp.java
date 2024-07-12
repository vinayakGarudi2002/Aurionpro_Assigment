package com.aurionpro.loop.assigment;

import java.util.Scanner;

public class WordGuessApp {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[] words = {"sham", "vinayak", "verma", "garden", "java"};
	        
	        String word = words[(int) (Math.random() * words.length)];
	        
	        char[] blanks = new char[word.length()];
	        for (int i = 0; i < blanks.length; i++) {
	        	if(i%2==0) {
	            blanks[i] = '_';
	        	}else {
	        		blanks[i]=word.charAt(i);
	        	}
	        }

	        
	        int lives = 5;
	        boolean gameStatus = false;

	        System.out.println("Welcome to Word Guess App!");

	        while (lives > 0 && !gameStatus) {
	        	
	            System.out.println("Word: " + String.valueOf(blanks));
	            
	            System.out.print("Guess a letter: ");
	            char guess = scanner.next().charAt(0);

	            boolean guessCorrect = false;
	            for (int i = 0; i < word.length(); i++) {
	                if (word.charAt(i) == guess) {
	                    blanks[i] = guess;
	                    guessCorrect = true;
	                }
	            }

	            if (!guessCorrect) {
	                lives--;
	                System.out.println("Wrong guess. Lives left: " + lives);
	            } else {
	                System.out.println("Good guess!");
	            }

	            gameStatus = true;
	            for (char c : blanks) {
	                if (c == '_') {
	                    gameStatus = false;
	                    break;
	                }
	            }
	        }

	        if (gameStatus) {
	            System.out.println("You won! word: " + word);
	        } else {
	            System.out.println("Game Over. The word was: " + word);
	        }

	        
	    }
}

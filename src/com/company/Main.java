package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		String book[] = new String[100];
		String author[] = new String[100];
		String description[] = new String[100];
		String answer = "y";
		String userInput = " ";
		int counter = 0;

		// Loop to populate the three arrays
		do {
			// First loop for titles
			System.out.println("Please Enter Book Title: ");
			userInput = Keyboard.nextLine();
			book[counter] = userInput;

			// Second loop for authors' names
			System.out.println("Please Enter Author Name: ");
			userInput = Keyboard.nextLine();
			author[counter] = userInput;

			// Third loop for description
			System.out.println("Please Enter Book Description: ");
			userInput = Keyboard.nextLine();
			description[counter] = userInput;

			// Prompting users to either continue or stop data entry
			System.out.println("Do you want to enter another title? (Y/N ");
			answer = Keyboard.nextLine();
			counter++;

		}while (answer.equalsIgnoreCase("y"));


		//Printing all data in the three arrays
		System.out.println();
		System.out.println("List of books entered: ");

		for (int counter1=0; counter1<counter; counter1++){
    		System.out.println("Book " + (counter1+1)+ " Title : "+ book[counter1]);
			System.out.println("Author Name " + (counter1+1) + " : "+ author[counter1]);
			System.out.println("Book " + (counter1+1)+" Description: "+ description[counter1]);
			System.out.println();
	}
	}
}

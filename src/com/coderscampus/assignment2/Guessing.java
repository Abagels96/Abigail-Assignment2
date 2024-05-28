package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class  Guessing {
Integer guessingNumber=chooseNumber();
	
Integer chooseNumber() {
	Random random= new Random();
	int guessingNumber=random.nextInt(1,101);
	
	
	Scanner scanner= new Scanner(System.in);
	System.out.println("Type in your guess");
	String scanning= scanner.nextLine();	
	
	
	Integer scan=Integer.parseInt(scanning);
	
	if( scan==guessingNumber) {
		System.out.println("You win");
	}
	else if(scan>=1&& scan<guessingNumber) {
		System.out.println("Please pick a higher number");
	}
	else if(scan<100 && scan>guessingNumber) {
		System.out.println("Please pick a lower number");
	}
	else { System.out.println("Your guess is not between 1 and 100 please pick again");
	}
	
	return guessingNumber;
}
	
	Integer getNumber() {
	return guessingNumber;
	}
}

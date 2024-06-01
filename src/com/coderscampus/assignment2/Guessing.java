package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class  Guessing {

	Integer scan;
boolean a;
Random random= new Random();
	
int guessingNumber=random.nextInt(1,101);


	
	
Integer chooseNumber( ) {
	System.out.println(guessingNumber);
	
	Scanner scanner= new Scanner(System.in);
	System.out.println("Type in your guess");
	String scanning= scanner.nextLine();	
	
	//where input is received hopefully runs five times 
	Integer scan=Integer.parseInt(scanning); //changing the input to an integer
	


		if( scan==guessingNumber) {
		System.out.println("You win");
	 
		
		}
	else if(scan>=1&& scan<guessingNumber) {
		System.out.println("Please pick a higher number");
		
	}
	else if(scan<100 && scan>guessingNumber) {
		System.out.println("Please pick a lower number");
		
	}
	else { System.out.println("Your guess is not between 1 and 100 please pick again");}
	
return scan;}



		
	String displayNumber(String a, Integer guessingNumber) {
		return  a +guessingNumber;
	}
}

package com.coderscampus.assignment2;

public class Main {
public static void main(String[]args) {

	
	Guessing guessing= new Guessing();
	Guessing grab= new Guessing();
for(int i=0; i<5; i++) {
	guessing.chooseNumber();
	Integer variable=grab.getNumber();
			 
	if(variable>100 && variable<1) {
	i--;
	}
	else {i++;}
}
	
	}
}
package com.coderscampus.assignment2;

public class Main {
public static void main(String[]args) {

	
	Guessing guessing= new Guessing();
	
for(int i=0; i<5; i++) {
	guessing.updateVariable(0);
	guessing.chooseNumber();
	
	Integer variable=guessing.getNumber();
			 
	if(variable>100 || variable<1) {
	i=i-1;
	}
	else {System.out.println(variable);}
	
	
}	}


}
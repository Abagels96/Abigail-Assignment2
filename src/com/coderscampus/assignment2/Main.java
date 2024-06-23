package com.coderscampus.assignment2;

public class Main {
    public static void main(String[] args) {
        Guessing guessing = new Guessing();
       boolean guessCorrectly=false;
      
        for (int i = 0; i < 5; i++) {
        	
        	
       
        
        	Integer input=guessing.chooseNumber();
       
 Integer number=guessing.guessingNumber;

 
 if(input>100||input<1) {
	 i--;
 }
 if(input==number) {
	 guessCorrectly=true;
	 
    break; 	}	
      
 
 
        }
          
      if (guessCorrectly) {
    	  System.out.println("");
      }
      else
 {System.out.println(guessing.displayName());
 return;
 }
     	
}}
       

          
       
        	
   
       
      
          
           
            	
            	
               
        
    


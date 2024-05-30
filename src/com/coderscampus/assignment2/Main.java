package com.coderscampus.assignment2;

public class Main {
    public static void main(String[] args) {
        Guessing guessing = new Guessing();
        
        for (int i = 0; i < 5; i++) {
           
            guessing.chooseNumber();
            
            
            Integer variable = guessing.getNumber();
            
            if (variable > 100 || variable < 1) {
                i--;  // Decrement the loop counter to retry
            } else {}
            	
            	
            guessing.displayNumber("This is the number you were looking for", variable);    
        }
    }
}

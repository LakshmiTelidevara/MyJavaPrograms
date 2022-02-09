package com.hcl.hw;

interface Grow{  
    // Default method   
    default void height(){  
    	
    		int heightA = 155;
    		int heightB = 165;
    		if (heightA > heightB) {
    			System.out.println("A is taller"); 
    }else 
    	System.out.println("B is taller"); 
    	}
    
    // Abstract method  
    void tallPerson(String result);  
}  
public class DefaultMethodsPractice implements Grow {  
    public void tallPerson(String result){        // implementing abstract method   
        System.out.println(result);  
    }  
    public static void main(String[] args) {  
        DefaultMethodsPractice dmp = new DefaultMethodsPractice();  
        dmp.height();   // calling default method  
        dmp.tallPerson("B won the prize!");  // calling abstract method  
  
    }  
}  

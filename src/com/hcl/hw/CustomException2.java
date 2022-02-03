package com.hcl.hw;

import java.util.Scanner;


import java.util.Scanner;

class CustomException2 extends Exception{
		public CustomException2 (String string){
		super (string);
	  }			
	
	public static void main (String[] args ){
			   try { 			
				Scanner input = new Scanner(System.in);	
				System.out.println("Enter your name(it must contain 15-20 characters): ");
				String name = input.nextLine();
				input.close();
				if(name.length()<10 || name.length() >15){
					throw new CustomException2 ("The name must contain at least 10 characters and maximum 15 characters");}
				else {
						System.out.println("Your name is " + name);				
					}
				
				
				
			   } catch(CustomException2 ex){
					ex.printStackTrace();
			   }
			   
  }
}

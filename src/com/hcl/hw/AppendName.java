package com.hcl.hw;

//This program appends a string to a given string at the end

public class AppendName {

	public static void main(String[] args) {

		StringBuffer name = new StringBuffer("Lakshmi Telidevara");
		
		// Prints the original string
		System.out.println("The original string: " + name);
		
		// Adds '-Developer' to the original string at the end
		name.append("-Developer");
		
		//Prints the modified string						
		System.out.println("The modified string: " + name);  

	}

}

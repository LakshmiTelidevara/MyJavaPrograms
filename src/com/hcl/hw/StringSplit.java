package com.hcl.hw;

//This program splits the string and returns an array of strings
//It takes regex (a delimiting regular expression and limit
//(the regular threshold)as the parameters

public class StringSplit {

	public static void main(String[] args) {
		String name = "LAKSHMI:TELIDEVARA:From:FRISCO";
		String [] arrName = name.split(":", 2);
		for (String x:arrName)
			System.out.println(x);
		System.out.println("********************");
		
		
		String [] arrName1 = name.split(":", 7);
		for (String x:arrName1)
			System.out.println(x);
		System.out.println("********************");
		
		String [] arrName2 = name.split(":", -2);
		for (String x:arrName2)
			System.out.println(x);
		System.out.println("********************");
		
		
		String [] arrName3 = name.split(":", 13);
		for (String x:arrName3)
			System.out.println(x);

	}

}

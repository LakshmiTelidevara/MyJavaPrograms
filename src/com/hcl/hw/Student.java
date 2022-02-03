package com.hcl.hw;
	
import java.util.Scanner;

	public class Student {
		
				
		public static void main (String[] args ){
		    			
			Scanner input = new Scanner(System.in);	      	
						
				
				String s1="Y";
				String s2 ="Y";
				
				while (s2.equalsIgnoreCase(s1)){
					
				System.out.println("Enter the student's Name:");
				String studentName = input.next();
				
				System.out.println("Enter the student's ID:");
				int studentID = input.nextInt();
				
				System.out.println("Enter the studen's score:");
				int score = input.nextInt();
							
				
					System.out.println(studentName);
					System.out.println(studentID);
					System.out.println(score);
					System.out.println("Do you want to add records? (Y/N): ");
					
					s1 = input.next();
					
				}
				
					System.out.println("Thank you!");
				
            
		
			}
				
				
				
			}


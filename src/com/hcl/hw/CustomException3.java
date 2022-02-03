package com.hcl.hw;

import java.util.Scanner;
//User defined exception

class CustomException3 extends Exception{
	public CustomException3 (String string){
		super (string);
	}			
	
	public static void main (String[] args ){
		
		String s1="Y";
		String s2 ="Y";
		int balance,savings_balance;
		savings_balance =600;
		balance= 600;
		//initial balance is same as savings_balance
				
		while (s2.equalsIgnoreCase(s1)){
		try {
			savings_balance = balance;//The current balance will be updated after every transaction
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the amount you want to withdraw:");
			int withdraw_amount = input.nextInt();
			balance = savings_balance - withdraw_amount;
					
						
			if(withdraw_amount>savings_balance){
				throw new CustomException3 ("Insufficient funds in your account");}
			//if the user wants to withdraw more than the balance amount, an exception is thrown
			else {
					System.out.println("Transaction successful!");
					System.out.println("The balance amount in your account is $" +balance);
					System.out.println("Do you want to withdraw again? (Y/N):");
					
					s1 = input.next();
					//The loop continues as long as the user wants to withdraw
									
			   }
		}
			catch(CustomException3 ex){
					ex.printStackTrace();
					//Custom exception details printed
			   }
		
	}		
			
			
	}
}
	



package com.hcl.hw;

interface MethodOne{
	void height();
}

public class MethodReferencePractice {
	
	public static void tallerPerson() {
		int heightA = 155;
		int heightB = 165;
		if (heightA > heightB) {
			System.out.println("A is taller");
		
	}else {
		System.out.println("B is taller");
	}
	}

	public static void main(String[] args) {
		
		//Referring static method
		MethodOne methodOne = MethodReferencePractice::tallerPerson;
        //Calling interface method
		methodOne.height();
	}
	}



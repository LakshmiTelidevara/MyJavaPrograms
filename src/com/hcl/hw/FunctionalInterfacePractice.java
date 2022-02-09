package com.hcl.hw;

@FunctionalInterface
interface Interest{
	void hobby(String passion);
}
public class FunctionalInterfacePractice implements Interest{
	public void hobby(String passion){
		System.out.println(passion);
	}
	public static void main(String[] args) {
		FunctionalInterfacePractice obj = new FunctionalInterfacePractice();
		obj.hobby("My passion is to learn things");
	}
}
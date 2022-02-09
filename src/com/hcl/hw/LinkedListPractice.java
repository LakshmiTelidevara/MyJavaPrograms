package com.hcl.hw;

import java.util.List;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {

	    LinkedList<String> student = new LinkedList<>();
		student.add("Ankit");
		student.add("Tom");
		student.add("Paul");
		student.add("John");
		
		student.addLast("Lakshmi");// Adds "Lakshmi" as the last element
		System.out.println(student);
		
		student.getLast();// Gets the last element
		System.out.println(student);// Prints the linked list
		
		student.removeFirst();//Removes the first element
		System.out.println(student);
        
		student.addFirst("Rita");//adds "Rita" the first element
		System.out.println(student);
	}
}

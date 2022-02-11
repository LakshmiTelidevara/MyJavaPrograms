package com.javabydeveloper;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Student;

/**
 * JPA Student Table
 *
 */
public class App {

	public static void main(String[] args) {

		// String s1="Y";
		String s2 = "Y";

		JPAcrudOperations obj = new JPAcrudOperations();
		Scanner s = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		String s1 = s.nextLine();
		System.out.println("Welcome!");

		while (s2.equalsIgnoreCase(s1)) {
			System.out.println("Press 1 to insert a record");
			System.out.println("Press 2 to get all the data");
			System.out.println("Press 3 to ind a Student record");
			System.out.println("Press 4 to update a Student record");
			System.out.println("Press 5 to delete  a Student record");
			System.out.println("Press any other Key to exit");
			System.out.println("Enter your option:");
			System.out.println("Columns: ID FirstName LastName Email.");
			String input2 = input.nextLine();

			switch (input2) {
			case "1": {
				System.out.println("Insert new student record:");

				System.out.print("\n Student First Name: ");
				String firstName = input.nextLine();

				System.out.print("\n Student Last Name: ");
				String lastName = input.nextLine();

				System.out.print("\n Email: ");
				String email = input.nextLine();

				obj.insert(firstName, lastName, email);
				break;
			}
			case "2": {
				obj.findAll();
				break;
			}
			case "3": {
				System.out.println("Enter the Student ID to get a Student record ");
				int id = input.nextInt();
				input.nextLine();
				obj.find(id);
				break;
			}
			case "4": {
				System.out.println("Enter the student ID to update a Student record");
				int id = input.nextInt();
				input.nextLine();
				System.out.print("\n Enter Student First Name to update: ");
				String firstName = input.nextLine();

				System.out.print("\n Enter Student Last Name to update: ");
				String lastName = input.nextLine();

				System.out.print("\n Enter Email to update: ");
				String email = input.nextLine();
				obj.update(id, firstName, lastName, email);
				break;

			}
			case "5": {
				System.out.println("Enter Student ID to delete");
				int id = input.nextInt();
				input.nextLine();
				obj.remove(id);
				break;
			}
			default: {
				System.out.println("Exit");
				return;
			}
			}
		}

		input.close();

		System.out.println("Do you want to continue for another transaction? Y/N ");
		s1 = input.next();

	}
}
